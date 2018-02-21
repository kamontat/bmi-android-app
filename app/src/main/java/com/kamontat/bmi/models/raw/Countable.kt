package com.kamontat.bmi.models.raw

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 21:42
 */
interface Countable {
    var number: Int

    fun get(): Int {
        return number;
    }

    fun add(num: Int)
    fun subtract(num: Int)
}