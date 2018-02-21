package com.kamontat.bmi.models

import com.kamontat.bmi.constants.HeightUnit
import com.kamontat.bmi.models.raw.Unitable

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 21:40
 */
class Height(private val number: Double, private val unit: Unitable<HeightUnit>) {
    fun get(unit: Unitable<HeightUnit>): Double {
        return this.unit.convert(number, unit)
    }

    fun getDefaultUnit(): Double {
        return this.unit.convert(number, HeightUnit.METER)
    }
}
