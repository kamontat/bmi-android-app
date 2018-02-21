package com.kamontat.bmi.utils

import android.util.Log
import com.kamontat.bmi.models.raw.Logable

/**
 * support static method and class method
 *
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 22:42
 */
class LogOf<T : Logable>(private val log: Logable) {

    companion object {

        private fun _checkNull(msg: Any?): Boolean {
            return (msg == null)
        }

        fun info(log: Logable, msg: Any?) {
            if (LogOf._checkNull(msg)) Log.i(log.getTag(), "null") else Log.i(log.getTag(), msg.toString())
        }

        fun debug(log: Logable, msg: Any?) {
            Log.d(log.getTag(), msg.toString());
        }
    }

    fun info(msg: Any?) {
        LogOf.info(log, msg)
    }

    fun debug(msg: Any?) {
        LogOf.debug(log, msg)
    }
}