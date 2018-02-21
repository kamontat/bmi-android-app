package com.kamontat.bmi.models.raw

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 22:42
 */
interface Logable {
    val TAG: String

    fun getTag(): String {
        return "BMI-" + TAG
    }
}