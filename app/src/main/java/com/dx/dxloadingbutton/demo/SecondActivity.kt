package com.dx.dxloadingbutton.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import com.dx.dxloadingbutton.R


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        animate()
    }

    fun animate() {
        val dialog = findViewById(R.id.linearlayout) as LinearLayout
        dialog.visibility = LinearLayout.VISIBLE
        val animation = AnimationUtils.loadAnimation(this, R.anim.layout_anim)
        animation.duration = 500
        dialog.animation = animation
        dialog.animate()
        animation.start()
    }

}
