package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        val mylogo : ImageView = findViewById(R.id.ivhotsar)
        val myanim = AnimationUtils.loadAnimation(this,R.anim.my_anim)
        mylogo.startAnimation(myanim)

        Handler().postDelayed({
            val intent = Intent(this,second_activity::class.java)
            startActivity(intent)
            finish()
        } ,6000)
    }
}