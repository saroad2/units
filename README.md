# units
A c++ library for units conversions.

click [here](https://github.com/saroad2/units/wiki) for full documentation of the library.

Motivation
==========

Assume you have the following class in c++:

```c++
class Robot
{
public:
  void walkForward(double distance);
  void spin(double angle);
};
```

It's obvious that `walkForward()` makes the robot simply walk forward and that `spin()` makes the robot spin,
but the big questions are:

> - In which unit is the `distance` variable passed to `walkForward()`?
> - In which unit is the `angle` variable passed to `spin()`?

Let's assume that the answer to this questions are **meters** and **degrees**.
How can we indicate the user that those are the unit in which `distance` and `angle` refer to?

We can do it in an *esthetic* way such as this:

```c++
class Robot
{
public:
  void walkForward(double distanceInMeters);
  void spin(double angleInDegrees);
};
```

or this:

```c++

class Robot
{
public:
  void walkForward(double distance); // In meters!!!
  void spin(double angle); // In degrees!!!
};
```

or even this:

```c++

typedef double Meters;
typedef double Degrees;

class Robot
{
public:
  void walkForward(Meters distance);
  void spin(Degrees angle);
};
```

But all of these options has a serious problem.

Let's assume that our user of the `Robot` class was confused and inserted a distance measured
in **yards** instead of **meters** to `walkForward()` and angle measured in **radians** instead of **degrees** to `spin()`. In this case:
* No compile error message will be printed to the user
* No runtime error message will be printed to the user
* The program will run perfectly and move the robot
* The robot will move the wrong distance but will assume it walked the right distance.
* The robot will spin in the wrong angle but will assume it spinned ok.

We need a solution that will fix this problem. Our main goal is:

> To create a library of units handling that will validate that the user uses the right units in his code

Our secondery goals are:
> * To do this validation in compiletime in order to prevent performance issues.
> * To support basic usage such as sumation, substraction, comparison, etc. of units.
> * To maintain high accuracy when using units (especially in casting from one unit to another).
> * To support insertion of new units to the library easily.

The Solution
============

*units* library gives you a class named `Meters` and a class named `Degrees` (along with many other units classes).
Therefore, you can declare your class in this way:

```c++

class Robot
{
public:
  void walkForward(Meters distance);
  void spin(Degrees distance);
};
```

Now, You can write the following code:

```c++
Robot r;
r.walkForward(Meters{3});
r.spin(Degrees{45});
```
and the robot will walk 3 meters forward and spin in 45 degrees.

**Pay Attention**:

The following will not compile:
```c++
Robot r;
r.walkForward(3); // Will not compile!
r.spin(45); // Will not compile!
```
Since all units classes has an explicit double constructor.
We implemented it that way so the user will make sure that he is using the right unit.

Moreover, the follwing will also not compile:

```c++
Robot r;
r.walkForward(Yards{3}); // Will not compile
r.spin(Radians{M_PI_4}); // Will not compile
```
Since the unit validation is done in **compiletime**.

Full Code Example
===========

```c++
#include "units/include/length_units.h"
#include "units/include/duration_units.h"
#include "units/include/speed_units.h"
#include "units/include/area_units.h"
#include "units/include/angle_units.h"
#include "units/include/angular_speed_units.h"

#include "units/include/units_cast.h"
#include "units/include/units_ratio.h"
#include "units/include/units_multiply.h"

#include <iostream>
#include <chrono>
#include <math.h>

using namespace std;
using namespace units::length;
using namespace units::duration;
using namespace units::speed;
using namespace units::area;
using namespace units::angle;
using namespace units::angular_speed;
using units::units_cast;
using units::units_ratio;
using units::units_multiply;

template<class AreaUnit, class LengthUnit1, class LengthUnit2>
constexpr AreaUnit calculateTriangleArea(
	const LengthUnit1& baseWidth,
	const LengthUnit2& height)
{
	/* You can multiply units by one another.
	 * In this case the result unit will be from a multiplication unit type of
	 * the given units and its value will be the multiplication of them.
	 * The result unit is validated to be from the right type.
	 *
	 * You can also multiply all units with scalars (doubles).
	 * In this case the result unit will stay the same.
	 * */
	return 0.5 * units_multiply<AreaUnit>(baseWidth, height);
}

int main()
{
	/* All units are printed with their values and unit names
	 * */
	Meters m{3};
	cout << m << endl;
	cout << endl;

	/* All units have a user defined literal.
	 * */
	auto m2 = 3.56_meters; // This is from Meters type
	cout << m2 << endl;
	cout << endl;

	/* You can sum and subtract units from one another
	 * only if they're from the same unit.
	 * */

	cout << m + m2 << endl;
	cout << m + 1.2_meters << endl;
	cout << m2 - m << endl;
	cout << -m2 << endl;
	/* cout << m - 2_feet << endl;
	 * This will not compile since you cannot subtract Meters from Feet
	 * without casting.
	 * */
	cout << endl;

	/* Time units have built-in integration with chrono
	 * */
	Seconds s{chrono::seconds{2}};
	cout << 3.6_seconds - s << endl;
	cout << endl;

	/* You can cast between units.
	 * When casting units, it is validated the both units,
	 * the converted and the result unit, are from the same type.
	 * */
	cout << units_cast<Yards>(m2) << endl;
	cout << units_cast<Feet>(m2) << endl;
	cout << units_cast<Inches>(m2) << endl;
	cout << units_cast<Centimeters>(m2) << endl;
	/* cout << units_cast<Knots>(m2) << endl;
	 * This will not compile since Meters is a length unit and
	 * Knots is a speed unit.
	 * */
	cout << endl;

	/* You can divide units by one another.
	 * In this case the result unit will be from a ratio type
	 * of the given units and its value will be the ratio of them.
	 * The result unit is validated to be from the right type.
	 * */
	cout << units_ratio<MetersPerSecond>(m2, s) << endl;
	cout << units_ratio<DegreesPerSecond>(Radians{M_PI_2}, s) << endl;
	cout << units_ratio<Knots>(50_inches, 1.5_minutes) << endl;
	/* cout << units_ratio<Radians>(50_inches, 1.5_minutes) << endl;
	 * This will not compile since Radians is an angle unit and not a speed unit
	 * */
	cout << endl;

	/* Working with the units library helps your code be more dynamic.
	 * */
	Yards y{8.2};
	cout << calculateTriangleArea<SquareYards>(m, m2) << endl;
	cout << calculateTriangleArea<SquareMeters>(m, y) << endl;
	cout << calculateTriangleArea<Dunams>(3.45_inches, y) << endl;
	/* cout << calculateTriangleArea<RadiansPerSecond>(3.45_inches, y) << endl;
	 * This will not compile since RadiansPerSecond is not an area unit.
	 * */
	cout << endl;

	return 0;
}
```

This main will print:
```
3 meters

3.56 meters

6.56 meters
4.2 meters
0.56 meters
-3.56 meters

1.6 seconds

3.89326 yards
11.6798 feet
140.157 inches
356 centimeters

1.78 meters/second
45 degrees/second
0.0274298 knots

6.38659 yards^2
11.2471 meters^2
0.000328528 dunams

```
