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
* The robot will spin in the wrong angle but will assume it spun ok.

We need a solution that will fix this problem. Our main goal is:

> To create a library of units handling that will validate that the user uses the right units in his code

Our secondary goals are:
> * To do this validation in compile time in order to prevent performance issues.
> * To support basic usage such as summation, subtraction, comparison, etc. of units.
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

Moreover, the following will also not compile:

```c++
Robot r;
r.walkForward(Yards{3}); // Will not compile
r.spin(Radians{M_PI_4}); // Will not compile
```
Since the unit validation is done in **compile time**.

Example
===========

Look [here](src/main/cpp/main.cc) for a full code example.

Software Requirements
========

library requirements:

- [c++14](https://en.wikipedia.org/wiki/C%2B%2B14) compiler

testing requirements:

- [google tests](https://github.com/google/googletest) library