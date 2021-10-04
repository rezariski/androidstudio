package com.example.testgauge.ui.gauge;

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekndev.gaugelibrary.Range

import com.ekn.gruzer.simplegaugeexample.R
import kotlinx.android.synthetic.main.fragment_multi_gauge.*


class MultiGaugeFragment : Fragment() {

    companion object {
        fun newInstance() = MultiGaugeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multi_gauge, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 50.0

        val range2 = Range()
        range2.color = Color.parseColor("#E3E500")
        range2.from = 50.0
        range2.to = 100.0

        val range3 = Range()
        range3.color = Color.parseColor("#00b20b")
        range3.from = 100.0
        range3.to = 150.0

        multiGauge.minValue = 0.0
        multiGauge.maxValue = 150.0
        multiGauge.value = 35.0

        multiGauge.secondMinValue = 0.0
        multiGauge.secondMaxValue = 150.0
        multiGauge.secondValue = 75.0

        multiGauge.thirdMinValue = 0.0
        multiGauge.thirdMaxValue = 150.0
        multiGauge.thirdValue = 100.0


        multiGauge.isDisplayValuePoint = true
        multiGauge.isUseRangeBGColor = true

        multiGauge.addRange(range)
        multiGauge.addRange(range2)
        multiGauge.addRange(range3)

        multiGauge.addSecondRange(range)
        multiGauge.addSecondRange(range2)
        multiGauge.addSecondRange(range3)

        multiGauge.addThirdRange(range)
        multiGauge.addThirdRange(range2)
        multiGauge.addThirdRange(range3)


        multi_gauge_value1_btn.setOnClickListener {
            multiGauge.value = multi_gauge_value1_ed.text.toString().toDouble()
        }

        multi_gauge_value2_btn.setOnClickListener {
            multiGauge.secondValue = multi_gauge_value2_ed.text.toString().toDouble()
        }

        multi_gauge_value3_btn.setOnClickListener {
            multiGauge.thirdValue = multi_gauge_value3_ed.text.toString().toDouble()
        }
    }


}