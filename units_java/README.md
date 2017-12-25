# units
A java library for units conversions.

click [here](https://github.com/saroad2/units/wiki) for full documentation of the library.

Motivation
==========

Assume you have the following class in java:

```java
class Robot {
	public void walkForward(double distance) {
		// moves the robot forward...
	}
	public void spin(double angle) {
		// spins the robot clockwise...
	}
}
```

It's obvious that `walkForward()` makes the robot simply walk forward and that `spin()` makes the robot spin,
but the big questions are:

> - In which unit is the `distance` variable passed to `walkForward()`?
> - In which unit is the `angle` variable passed to `spin()`?

Let's assume that the answer to this questions are **meters** and **degrees**.
How can we indicate the user that those are the unit in which `distance` and `angle` refer to?

We can do it in an *esthetic* way such as this:

```java
class Robot {
	public void walkForward(double distanceInMeters) {
		// moves the robot forward...
	}
	public void spin(double angleInDegrees) {
		// spins the robot clockwise...
	}
}
```

or this:

```java
class Robot {
	public void walkForward(double distance) {
		// moves the robot forward in the given distance, measured in METERS!!!
	}
	public void spin(double angleInDegrees) {
		// spins the robot clockwise in the given angle. measured in DEGREES!!!
	}
}
```

But these options has a serious problem.

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

```java
class Robot {
	public void walkForward(Meters distance) {
		// moves the robot forward...
	}
	public void spin(Degrees angle) {
		// spins the robot clockwise...
	}
}
```

Now, You can write the following code:

```java
Robot robot = new Robot();
robot.walkForward(new Meters(3));
robot.spin(new Degrees(45));
```
and the robot will walk 3 meters forward and spin in 45 degrees.

**Pay Attention**:

The following will not compile:
```java
Robot robot = new Robot();
robot.walkForward(3);
robot.spin(45);
```
Since double is not the input type of the functions.

Moreover, the following will also not compile:

```java
Robot robot = new Robot();
robot.walkForward(new Yards(3));
robot.spin(new Radians(Math.PI / 4));
```
Since the unit validation is done in **compile time**.

Example
===========

Look [here](src/main/java/com/units/MainExample.java) for a full code example.

Software Requirements
========

library requirements:

- [java8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) compiler
