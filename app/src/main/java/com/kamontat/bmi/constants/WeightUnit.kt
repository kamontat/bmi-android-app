package com.kamontat.bmi.constants

import com.kamontat.bmi.models.raw.Unitable

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 21:51
 */
enum class WeightUnit(override val offset: Double) : Unitable<WeightUnit> {
    KILOGRAM(1.0), GRAM(1000.0), TON(0.001), POUND(2.2046244202), OUNCE(35.273990723);
}