# basic usage

all examples are written using the following classes:
- Meters
- Yards
- MetersPerSecond

Of course that the same usage will be for any other unit.

Construtors
=======

All units classes are supporting the following constructors:

- default constructor (**explicit!**)
- double constructor (**explicit!**)
- copy constructor
- move constructor

Look at the following code for example:

```c++
Meters m1; // Default constructor
Meters m2{3}; // Double constructor
Meters m3{m2}; // Copy constructor
Meters m4{std::move(m3)}; // Move constructor
```

**Pay Attention**:

The following code will not compile:
```c++
Meters m1 = 3; // Will not compile, since double constructor is explicit.
Yards y{3};
Meters m2{y}; // Will not compile, since there is not implicit conversion between different units.
```

The reason the double constructor is explicit is that we want the user to declare the unit he is using in his code. Using the `explicit` keyword of c++ helps us get this effect.

Sumation and Substraction
================

You can add and substract units objects from the same class. Look at the following code for example:

```c++
Meters m1{3};
Meters m2{4};
auto m3 = m1 + m2;
auto m4 = -m1;
auto m5 = m1 - m2;
```

The following code won't compile:

```c++
Meters m{3};
Yards y{4};
auto m2 = m + y; // Will not compile, since you cannot sum different units.
Meters m3 = -y; // Will not compile, since you can't convert from different units implicitly.
auto m4 = m - y; ; // Will not compile, since you cannot substract different units.
```

Multiply by Scalar
==========

You can multiply every unit with doubles from the right and and the left. This operation represent multiplication by scalar. Look at the following code for example:


```c++
Meters m1{3};
auto m2 = 3 * m1; // Equal to Meters{6}
auto m3 = m1 * 2.5; // Equal to Meters{7.5}
```

Comparison
=======

You can compare between units the same way you compare doubles. Look at the following code for example:

```c++
Meters m1{3};
Meters m2{4};
if (m1 == m2) cout << "equal!" << endl;
bool bigger = m1 < m2;
```

*units* supports all comparison operators:

- ==
- !=
- <
- <=
- \>
- \>=

The following code won't compile:

```c++
Meters m{3};
Yards y{4};
if (m == y) cout << "equal!" << endl; // Will not compile, since you cannot compare between different units
bool bigger = m < y; // Will not compile, since you cannot compare between different units
```

Printings
=====

All units support printings. When printing a unit it prints the unit name as well. Look at the following code for example:

```c++
cout << Meters{3} << endl; // Will print "3 meters"
cout << Yards{4.5} << endl; // Will print "4.5 yards"
cout << MetersPerSecond{-7.123} << endl; // Will print "-7.123 meters/second"
```

User Defined Literals
============

every unit has a user defined literal for it. Look at the following code for example:

```c++
cout << 3_meters << endl; // Will print "3 meters"
auto y = -5.2_yards; // Equal to Yards{-5.2}
```

Units Cast
======

You can cast from one unit to another using the `units_cast()` function. Look at the following code for example:

```c++
Meters m{1};
Yards y{1};
Feet f{10};
cout << units_cast<Yards>(m) << endl; // Will print "1.094 yards"
auto m2 = units_cast<Meters>(y); // Equal to Meters{0.144}
auto m3 = units_cast<Meters>(f) - m; // Equal to Meters{2.048}
```

The following code will not compile:

```c++
Meters m{1};
cout << units_cast<Knots>(m) << endl; // Will not compile, since you cannot cast untis from different types (speed and length)
```
