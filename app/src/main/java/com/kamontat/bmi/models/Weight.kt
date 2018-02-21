package com.kamontat.bmi.models

import com.kamontat.bmi.constants.WeightUnit
import com.kamontat.bmi.models.raw.Unitable

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 21:40
 */
class Weight(private val number: Double, private val unit: Unitable<WeightUnit>) {
    fun get(unit: Unitable<WeightUnit>): Double {
        return this.unit.convert(number, unit)
    }

    fun getDefaultUnit(): Double {
        return this.unit.convert(number, WeightUnit.KILOGRAM)
    }
}
