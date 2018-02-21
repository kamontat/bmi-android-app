package com.kamontat.bmi.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.kamontat.bmi.R
import com.kamontat.bmi.constants.BMIUnit
import com.kamontat.bmi.controllers.MainController
import com.kamontat.bmi.models.raw.Logable
import java.util.*

class MainActivity : AppCompatActivity(), Logable {
    override val TAG: String
        get() = "Main Activity"

    private val componentMap: HashMap<String, View> = HashMap();

    private val controller: MainController = MainController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        componentMap["calculate"] = findViewById(R.id.calculate)
        componentMap["heightInput"] = findViewById(R.id.heightInput)
        componentMap["weightInput"] = findViewById(R.id.weightInput)
        componentMap["image"] = findViewById(R.id.imageView)
        componentMap["result"] = findViewById(R.id.resultLb)

        controller.setup()

        // val w = Weight(100.0, WeightUnit.POUND)
        // println(Log.INFO, "Weight Log", w.getDefaultUnit().toString())
    }

    fun setCalculateAction(listener: View.OnClickListener) {
        componentMap["calculate"]?.setOnClickListener(listener)
    }

    fun getWeight(): Double {
        return (componentMap["weightInput"] as EditText).text.toString().toDoubleOrNull() ?: 0.0
    }

    fun getHeight(): Double {
        return (componentMap["heightInput"] as EditText).text.toString().toDoubleOrNull() ?: 0.0
    }

    fun setImage(resId: Int) {
        (componentMap["image"] as ImageView).setImageResource(resId);
    }

    fun setResult(msg: String) {
        (componentMap["result"] as TextView).text = msg
    }

    fun updateResult(bmiResult: BMIUnit) {
        setImage(bmiResult.getDrawableImage())
        setResult(bmiResult.toString())
    }
}
