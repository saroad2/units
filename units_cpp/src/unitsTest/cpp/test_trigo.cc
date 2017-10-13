/*
 * test_trigo.cc
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#include <units/trigo.h>
#include <units/angle_units.h>
#include <units/length_units.h>

#include <gtest/gtest.h>
#include <functional>
#include <vector>
#include <math.h>
#include <cmath>

using namespace units::angle;
using namespace units::length;
using namespace testing;
using std::vector;

class TestTrigo : public Test
{
protected:
	std::vector<Degrees> degreesValues = {};
	std::vector<Radians> radiansValues = {};
	std::vector<Mils> milsValues = {};
	std::vector<double> doubleValues = {};

	void checkError(auto input, double doubleValue, auto errorFunction)
	{
		double error = errorFunction(input, doubleValue);
		ASSERT_LT(error, 1e-9);
	}

	void run(auto errorFunction)
	{
		std::size_t size = doubleValues.size();
		for (std::size_t i=0; i < size; ++i)
		{
			checkError(degreesValues[i], doubleValues[i], errorFunction);
			checkError(radiansValues[i], doubleValues[i], errorFunction);
			checkError(milsValues[i], doubleValues[i], errorFunction);
		}
	}
};

TEST_F(TestTrigo, sin)
{
	degreesValues = {
			Degrees(0),
			Degrees(30),
			Degrees(45),
			Degrees(60),
			Degrees(90)};
	radiansValues = {
			Radians(0),
			Radians(M_PI / 6),
			Radians(M_PI / 4),
			Radians(M_PI / 3),
			Radians(M_PI / 2)};
	milsValues = {
			Mils(0),
			Mils(6400.0 / 12),
			Mils(6400.0 / 8),
			Mils(6400.0 / 6),
			Mils(6400.0 / 4)};
	doubleValues = {0, 0.5, std::sqrt(0.5), std::sqrt(0.75), 1};
	run([](const auto& unit, double doubleValue) {
		return std::abs(units::trigo::sin(unit) - doubleValue);
	});
}

TEST_F(TestTrigo, cos)
{
	degreesValues = {
			Degrees(0),
			Degrees(30),
			Degrees(45),
			Degrees(60),
			Degrees(90)};
	radiansValues = {
			Radians(0),
			Radians(M_PI / 6),
			Radians(M_PI / 4),
			Radians(M_PI / 3),
			Radians(M_PI / 2)};
	milsValues = {
			Mils(0),
			Mils(6400.0 / 12),
			Mils(6400.0 / 8),
			Mils(6400.0 / 6),
			Mils(6400.0 / 4)};
	doubleValues = {1, std::sqrt(0.75), std::sqrt(0.5), 0.5, 0};
	run([](const auto& unit, double doubleValue) {
		return std::abs(units::trigo::cos(unit) - doubleValue);
	});
}

TEST_F(TestTrigo, tan)
{
	degreesValues = {
			Degrees(0),
			Degrees(30),
			Degrees(45),
			Degrees(60)};
	radiansValues = {
			Radians(0),
			Radians(M_PI / 6),
			Radians(M_PI / 4),
			Radians(M_PI / 3)};
	milsValues = {
			Mils(0),
			Mils(6400.0 / 12),
			Mils(6400.0 / 8),
			Mils(6400.0 / 6)};
	doubleValues = {0, std::sqrt(1.0 / 3), 1, std::sqrt(3)};
	run([](const auto& unit, double doubleValue) {
		return std::abs(units::trigo::tan(unit) - doubleValue);
	});
}

TEST_F(TestTrigo, asin)
{
	degreesValues = {
			Degrees(0),
			Degrees(30),
			Degrees(45),
			Degrees(60),
			Degrees(90)};
	radiansValues = {
			Radians(0),
			Radians(M_PI / 6),
			Radians(M_PI / 4),
			Radians(M_PI / 3),
			Radians(M_PI / 2)};
	milsValues = {
			Mils(0),
			Mils(6400.0 / 12),
			Mils(6400.0 / 8),
			Mils(6400.0 / 6),
			Mils(6400.0 / 4)};
	doubleValues = {0, 0.5, std::sqrt(0.5), std::sqrt(0.75), 1};
	run([](auto unit, double doubleValue) {
		using Unit = decltype(unit);
		return (units::trigo::asin<Unit>(doubleValue) - unit).value();
	});
}

TEST_F(TestTrigo, acos)
{
	degreesValues = {
			Degrees(0),
			Degrees(30),
			Degrees(45),
			Degrees(60),
			Degrees(90)};
	radiansValues = {
			Radians(0),
			Radians(M_PI / 6),
			Radians(M_PI / 4),
			Radians(M_PI / 3),
			Radians(M_PI / 2)};
	milsValues = {
			Mils(0),
			Mils(6400.0 / 12),
			Mils(6400.0 / 8),
			Mils(6400.0 / 6),
			Mils(6400.0 / 4)};
	doubleValues = {1, std::sqrt(0.75), std::sqrt(0.5), 0.5, 0};
	run([](auto unit, double doubleValue) {
		using Unit = decltype(unit);
		return (units::trigo::acos<Unit>(doubleValue) - unit).value();
	});
}

TEST_F(TestTrigo, atan)
{
	degreesValues = {
			Degrees(0),
			Degrees(30),
			Degrees(45),
			Degrees(60)};
	radiansValues = {
			Radians(0),
			Radians(M_PI / 6),
			Radians(M_PI / 4),
			Radians(M_PI / 3)};
	milsValues = {
			Mils(0),
			Mils(6400.0 / 12),
			Mils(6400.0 / 8),
			Mils(6400.0 / 6)};
	doubleValues = {0, std::sqrt(1.0 / 3), 1, std::sqrt(3)};
	run([](auto unit, double doubleValue) {
		using Unit = decltype(unit);
		return (units::trigo::atan<Unit>(doubleValue) - unit).value();
	});
}

TEST_F(TestTrigo, atan2)
{
	EXPECT_NEAR(
			units::trigo::atan2<Degrees>(
				Meters{0},
				Meters{8}).value(),
			0,
			1e-9);
	EXPECT_NEAR(
			units::trigo::atan2<Radians>(
				Inches{2 * sqrt(3)},
				Inches{2}).value(),
			M_PI / 3,
			1e-9);
	EXPECT_NEAR(
			units::trigo::atan2<Mils>(
				Feet{5.2},
				Feet{5.2}).value(),
			800,
			1e-9);
}
