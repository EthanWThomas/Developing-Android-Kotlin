package edu.dixietech.ethanthomas1906.stundent.video.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.toColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableView: List<View> =
            listOf(
                findViewById(R.id.box_one_text),
                findViewById(R.id.box_two_text),
                findViewById(R.id.box_three_text),
                findViewById(R.id.box_four_text),
                findViewById(R.id.box_five_text),
                findViewById(R.id.constraint_layout),
                findViewById(R.id.red_button),
                findViewById(R.id.yellow_button),
                findViewById(R.id.green_button)
            )

        for (item in clickableView) {
            item.setOnClickListener { makeColored(it)}
        }
    }

    @SuppressLint("ResourceType")
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class color resources for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> findViewById<View?>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> findViewById<View?>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<View?>(R.id.box_five_text).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}