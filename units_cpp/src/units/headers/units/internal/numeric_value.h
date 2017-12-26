/*
 * numeric_value.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_NUMERIC_VALUE_H_
#define INCLUDE_NUMERIC_VALUE_H_

#include <units/internal/tags.h>
#include <units/internal/same_type_validator.h>

#include <type_traits>
#include <ostream>
#include <string>

namespace units
{

template<class Unit1, class Unit2>
struct is_from_the_same_type;

template<class Unit1, class Unit2>
struct is_same_unit;

template<class... Units>
struct multiply_builder;

template <class Unit, int power>
struct pow_builder;

template<class Unit1, class Unit2>
struct ratio_builder;

template<class Unit>
struct inverse_builder;

template<class Unit, class... ActualTags>
struct tag_builder;

template<class Unit, class... RemovedTags>
struct untag_builder;

template<class Unit>
struct untag_all_builder;

template<class Unit, class Tag>
struct has_tag;

//Function friends declarations
template<class To, class From>
constexpr double conversionScale();

template<typename ScaleTag, typename OtherTags = Tags<>>
class NumericValue
{
private:
	using _selfType = NumericValue<ScaleTag, OtherTags>;
protected:
	using _scale = ScaleTag;
	using _tags = OtherTags;
public:

	constexpr NumericValue() = default;
	explicit constexpr NumericValue(double value)
	: _value{value}
	{
	}
	constexpr NumericValue(const _selfType& Other) = default;
	constexpr NumericValue(_selfType&& Other) = default;
	_selfType& operator=(const _selfType& other) = default;

	constexpr double value() const {return _value;}
	explicit constexpr operator double() const {return value();}

	template<class Tag>
	static constexpr bool hasTag()
	{
		return has_tag<_selfType, Tag>::value;
	}

	template<class... SomeOtherTags>
	constexpr _selfType& operator+=(const NumericValue<SomeOtherTags...>& other)
	{
		using OtherNumericValue = NumericValue<SomeOtherTags...>;
		VALIDATE_SAME_UNIT(_selfType, OtherNumericValue);
		_value += other.value();
		return *this;
	}

	template<class... SomeOtherTags>
	constexpr _selfType& operator-=(const NumericValue<SomeOtherTags...>& other)
	{
		using OtherNumericValue = NumericValue<SomeOtherTags...>;
		VALIDATE_SAME_UNIT(_selfType, OtherNumericValue);
		_value -= other.value();
		return *this;
	}

	constexpr _selfType& operator*=(double scalar)
	{
		_value *= scalar;
		return *this;
	}

	constexpr _selfType& operator/=(double scalar)
	{
		_value /= scalar;
		return *this;
	}

	constexpr double scalarRatio(const _selfType& other) const
	{
		return value() / other.value();
	}

	//Class friends declarations
	template<class Unit1, class Unit2>
	friend struct is_from_the_same_type;

	template<class Unit1, class Unit2>
	friend struct is_same_unit;

	template<class... Units>
	friend struct multiply_builder;

	template <class Unit, int power>
	friend struct pow_builder;

	template<class Unit1, class Unit2>
	friend struct ratio_builder;

	template<class Unit>
	friend struct inverse_builder;

	template<class Unit, class... ActualTags>
	friend struct tag_builder;

	template<class Unit, class... RemovedTags>
	friend struct untag_builder;

	template<class Unit>
	friend struct untag_all_builder;

	template<class Unit, class Tag>
	friend struct has_tag;

	//Function friends declarations
	template<class To, class From>
	friend constexpr double conversionScale();

	template<class... Tags>
	friend std::ostream& operator<<(
			std::ostream& stream, const NumericValue<Tags...>& unit);

private:
	double _value;
};

template<class... Tags1, class... Tags2>
constexpr bool operator==(const NumericValue<Tags1...>& first,
						  const NumericValue<Tags2...>& second)
{
	VALIDATE_SAME_UNIT(NumericValue<Tags1...>, NumericValue<Tags2...>);
	return first.value() == second.value();
}

template<class... Tags1, class... Tags2>
constexpr bool operator!=(const NumericValue<Tags1...>& first,
						  const NumericValue<Tags2...>& second)
{
	return not(first == second);
}

template<class... Tags1, class... Tags2>
constexpr bool operator<(const NumericValue<Tags1...>& first,
						 const NumericValue<Tags2...>& second)
{
	VALIDATE_SAME_UNIT(NumericValue<Tags1...>, NumericValue<Tags2...>);
	return first.value() < second.value();
}

template<class... Tags1, class... Tags2>
constexpr bool operator<=(const NumericValue<Tags1...>& first,
						  const NumericValue<Tags2...>& second)
{
	return not(second < first);
}


template<class... Tags1, class... Tags2>
constexpr bool operator>(const NumericValue<Tags1...>& first,
						  const NumericValue<Tags2...>& second)
{
	return second < first;
}

template<class... Tags1, class... Tags2>
constexpr bool operator>=(const NumericValue<Tags1...>& first,
						  const NumericValue<Tags2...>& second)
{
	return not(first < second);
}

template<class... Tags1, class... Tags2>
constexpr NumericValue<Tags1...> operator+(const NumericValue<Tags1...>& first,
										   const NumericValue<Tags2...>& second)
{
	NumericValue<Tags1...> copy{first};
	copy += second;
	return copy;
}

template<class... Tags>
constexpr NumericValue<Tags...> operator-(const NumericValue<Tags...>& unit)
{
	return NumericValue<Tags...>{-unit.value()};
}

template<class... Tags1, class... Tags2>
constexpr NumericValue<Tags1...> operator-(const NumericValue<Tags1...>& first,
										   const NumericValue<Tags2...>& second)
{
	return first + (-second);
}

template<class... Tags>
constexpr NumericValue<Tags...> operator*(double scalar, const NumericValue<Tags...>& unit)
{
	auto result = NumericValue<Tags...>{unit};
	result *= scalar;
	return result;
}

template<class... Tags>
constexpr NumericValue<Tags...> operator*(const NumericValue<Tags...>& unit, double scalar)
{
	return scalar * unit;
}

template<class... Tags>
constexpr NumericValue<Tags...> operator/(const NumericValue<Tags...>& unit, double scalar)
{
	auto result = NumericValue<Tags...>{unit};
	result /= scalar;
	return result;
}

template<class... Tags>
std::ostream& operator<<(std::ostream& stream, const NumericValue<Tags...>& unit)
{
	stream << unit.value() << " " << NumericValue<Tags...>::_scale::pluralName();
	return stream;
}

} /* namespace units */

#endif /* INCLUDE_NUMERIC_VALUE_H_ */

