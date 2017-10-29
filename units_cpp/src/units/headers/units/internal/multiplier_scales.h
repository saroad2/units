/*
 * multiplier_scales.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_MULTIPLYER_SCALES_H_
#define INCLUDE_MULTIPLYER_SCALES_H_

namespace units
{

template<class Multiplier>
constexpr double multiplyBy(double scale)
{
	return scale * Multiplier::num / Multiplier::den;
}

}

#endif /* INCLUDE_MULTIPLYER_SCALES_H_ */
