package com.kamontat.bmi.constants

import com.kamontat.bmi.models.raw.Unitable

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 21:51
 */
enum class HeightUnit(override val offset: Double) : Unitable<HeightUnit> {
    METER(1.0), CENTIMETER(100.0), KILOMETER(0.001), YARD(1.0936132983), FOOT(3.280839895);
}