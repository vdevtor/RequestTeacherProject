package com.example.requestprofessorproject.View.Activity

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.requestprofessorproject.R

class SplashScreenActivity : AppCompatActivity() {
    lateinit var s1 : ImageView
    lateinit var s2 : TextView
    lateinit var  i : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)
        s1 = findViewById<ImageView>(R.id.spHat)
        s2 = findViewById<TextView>(R.id.spText)
        val i = Intent(this, TelaLoginActivity::class.java)
        actionBar?.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        s1.alpha = 0f
        s2.alpha = 0f

            s1.animate().alpha(1f).setDuration(3000).withEndAction {
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            }

            s2.animate().alpha(1f).setDuration(3000).withEndAction {
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                startActivity(i)
                finish()

            }
        }

    }
