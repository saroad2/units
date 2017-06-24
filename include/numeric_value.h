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
				  "Cannot use this operation on units from different types");

template<class ScaleTag>
class NumericValue
{
private:

	using _selfType = NumericValue<ScaleTag>;
	using _scale = ScaleTag;

public:
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

	template<class OtherScaleTag>
	constexpr _selfType& operator+=(const NumericValue<OtherScaleTag>& other)
	{
		VALIDATE_SAME_UNIT(_selfType, NumericValue<OtherScaleTag>);
		_value += (double)other;
		return *this;
	}

	template<class OtherScaleTag>
	constexpr _selfType& operator-=(const NumericValue<OtherScaleTag>& other)
	{
		VALIDATE_SAME_UNIT(_selfType, NumericValue<OtherScaleTag>);
		_value -= (double)other;
		return *this;
	}

	void print(std::ostream& stream) const
	{
		stream << value() << " " << pluralName();
	}


private:
	double _value;
	static constexpr double scale() {return _scale::scale;}
	static std::string singularName() {return _scale::singularName();}
	static std::string pluralName() {return _scale::pluralName();}

	template<class To, class... Tags>
	friend To units_cast(const NumericValue<Tags...>& unit);
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

template<class... Tags1, class... Tags2>
constexpr NumericValue<Tags1...> operator-(const NumericValue<Tags1...>& first,
										   const NumericValue<Tags2...>& second)
{
	NumericValue<Tags1...> copy{first};
	copy -= second;
	return copy;
}

template<class ScaleTag>
std::ostream& operator<<(std::ostream& stream, const NumericValue<ScaleTag>& unit)
{
	unit.print(stream);
	return stream;
}

} /* namespace units */

#endif /* INCLUDE_NUMERIC_VALUE_H_ */

