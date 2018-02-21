package com.kamontat.bmi.controllers

import android.view.View
import com.kamontat.bmi.constants.BMIUnit
import com.kamontat.bmi.constants.HeightUnit
import com.kamontat.bmi.constants.WeightUnit
import com.kamontat.bmi.models.Height
import com.kamontat.bmi.models.Weight
import com.kamontat.bmi.models.raw.Logable
import com.kamontat.bmi.views.MainActivity

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 21/Feb/2018 - 22:21
 */
class MainController(private val activity: MainActivity) : Logable {

    override val TAG: String
        get() = "Main Controller"

    fun setup() {
        activity.setCalculateAction(View.OnClickListener {
            val w = Weight(activity.getWeight(), WeightUnit.KILOGRAM);
            val h = Height(activity.getHeight(), HeightUnit.METER);

            activity.updateResult(BMIUnit.define(w, h));
        });
    }
}