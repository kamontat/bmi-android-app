package com.kamontat.bmi.constants

import com.kamontat.bmi.R
import com.kamontat.bmi.models.Height
import com.kamontat.bmi.models.Weight

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 23:20
 */
enum class BMIUnit(private val resId: Int) {
    UNDER_WEIGHT(R.drawable.uw),
    HEALTHY_WEIGHT(R.drawable.hw), OVERWEIGHT(R.drawable.ow), OBESE(R.drawable.ob);

    companion object {
        fun define(weight: Weight, height: Height): BMIUnit {
            val bmi = weight.get(WeightUnit.KILOGRAM) / Math.pow(height.get(HeightUnit.METER), 2.0)
            return when (bmi) {
                in 0.0..18.5 -> UNDER_WEIGHT
                in 18.5..24.9 -> HEALTHY_WEIGHT
                in 24.9..29.9 -> OVERWEIGHT
                else -> OBESE
            }
        }
    }

    fun getDrawableImage(): Int {
        return resId
    }

    override fun toString(): String {
        return name.toLowerCase().replace("_", " ")
    }
}