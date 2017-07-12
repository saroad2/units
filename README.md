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
};
```

It's obviouse that the `walkForward()` function makes the robot simply... um... walk forward,
but the big question is:

> In which unit does the `distance` variable given?

Let's assume that the answer to this question is **meters**.
How can we indicate the user that this is the unit in which `distance` refers to?

We can do it in an *esthetic* way such as this:

```c++
class Robot
{
public:
  void walkForward(double distanceInYards);
};
```

or this:

```c++

class Robot
{
public:
  void walkForward(double distance); // In meters!!!
};
```

or even this:

```c++

typedef double Meters;

class Robot
{
public:
  void walkForward(Meters distance);
};
```

But all of this options has a serious problem.

Let's assume that our user of the `Robot` class was confused and inserted a distance measured
in **yards** instead of **meters** to the `walkForward()` function. In this case:
* No compile error message will be printed to the user
* No runtime error message will be printed to the user
* The program will run perfectly and move the robot
* The robot will move the wrong distance but will assume it walked the right distance.

We need a solution that will fix this problem. Our main goal is:

> To create a library of units handling that will validate that the user uses the right units in his code

Our secondery goals are:
> * To do this validation in compiletime in order to prevent performance issues.
> * To support basic usage such as sumation, substraction, comparison, etc. of units.
> * To maintain high accuracy when using units (especially in casting from one unit to another).
> * To support insertion of new units to the library easily.

The Solution
============

*units* library gives you a class named `Meters` (such as many other units).
Now, you can declare your class in that way:

```c++

class Robot
{
public:
  void walkForward(Meters distance);
};
```

Now, You can write the following code:

```c++
Robot r;
r.walkForward(Meters{3});
```
and the robot will walk 3 meters forward.

**Pay Attention**:

The following will not compile:
```c++
Robot r;
r.walkForward(3);
```
Since the class `Meters` has an explicit double constructor.
We implemented it that way so the user will make sure that he is using the right unit.

Moreover, the follwing will also not compile:

```c++
Robot r;
r.walkForward(Yards{3});
```
Since the unit validation is done in **compiletime**.

Usage Guides
========

- [Basic Usage](docs/basic_usage.md)