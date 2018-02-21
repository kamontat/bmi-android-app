package com.kamontat.bmi.models.raw

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 21:51
 */
interface Unitable<T : Unitable<T>> {
    val offset: Double

    fun convert(number: Double, to: Unitable<T>): Double {
        return number * to.offset / this.offset;
    }
}