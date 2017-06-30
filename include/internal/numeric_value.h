/*
 * numeric_value.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_NUMERIC_VALUE_H_
#define INCLUDE_NUMERIC_VALUE_H_

#include <type_traits>
#include <ostream>
#include <string>

namespace units
{

#define VALIDATE_SAME_UNIT(Unit1, Unit2) \
	static_assert(std::is_same<Unit1, Unit2>::value, \
				  "Cannot use this operation on different units");

template<class ScaleTag, class TypeTag>
class NumericValue
{
private:
	using _selfType = NumericValue<ScaleTag, TypeTag>;
public:
	using _scale = ScaleTag;
	using _type = TypeTag;
	using _typeCode = typename TypeTag::code;

	constexpr NumericValue() = default;
	explicit constexpr NumericValue(double value)
	: _value{value}
	{
	}
	constexpr NumericValue(const _selfType& Other) = default;
	constexpr NumericValue(_selfType&& Other) = default;
	constexpr _selfType& operator=(const _selfType& other) = default;

	constexpr double value() const {return _value;}
	explicit constexpr operator double() const {return value();}

	template<class OtherScaleTag, class OtherTypeTag>
	constexpr _selfType& operator+=(const NumericValue<OtherScaleTag, OtherTypeTag>& other)
	{
		using OtherNumericValue = NumericValue<OtherScaleTag, OtherTypeTag>;
		VALIDATE_SAME_UNIT(_selfType, OtherNumericValue);
		_value += (double)other;
		return *this;
	}

	template<class OtherScaleTag, class OtherTypeTag>
	constexpr _selfType& operator-=(const NumericValue<OtherScaleTag, OtherTypeTag>& other)
	{
		using OtherNumericValue = NumericValue<OtherScaleTag, OtherTypeTag>;
		VALIDATE_SAME_UNIT(_selfType, OtherNumericValue);
		_value -= (double)other;
		return *this;
	}

	void print(std::ostream& stream) const
	{
		stream << value() << " " << pluralName();
	}

	static constexpr double scale() {return _scale::scale;}
	static std::string singularName() {return _scale::singularName();}
	static std::string pluralName() {return _scale::pluralName();}
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
	return NumericValue<Tags...>{scalar * unit.value()};
}

template<class... Tags>
constexpr NumericValue<Tags...> operator*(const NumericValue<Tags...>& unit, double scalar)
{
	return scalar * unit;
}

template<class ScaleTag, class TypeTag>
std::ostream& operator<<(std::ostream& stream, const NumericValue<ScaleTag, TypeTag>& unit)
{
	unit.print(stream);
	return stream;
}

} /* namespace units */

#endif /* INCLUDE_NUMERIC_VALUE_H_ */

