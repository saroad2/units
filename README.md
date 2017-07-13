# units
A c++ library for units conversions.

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

It's obviouse that the `walkForward()` function makes the robot simply walk forward and that the `spin()` function will make the robot spin,
but the big question is:

> - In which unit does the `distance` variable given in the `walkForward()` function?
> - In which unit does the `angle` variable given in the `spin()` function?

Let's assume that the answer to this questions ate **meters** and **degrees**.
How can we indicate the user that those are the unit in which `distance` and `angle` refer to?

We can do it in an *esthetic* way such as this:

```c++
class Robot
{
public:
  void walkForward(double distanceInYards);
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

But all of this options has a serious problem.

Let's assume that our user of the `Robot` class was confused and inserted a distance measured
in **yards** instead of **meters** to the `walkForward()` function and angle measured in **radians** instead of **degrees** to the `spin()` function. In this case:
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
