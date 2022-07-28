package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloButton)
        val relativeLayout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.background)
        val image = findViewById<ImageView>(R.id.introImgView)
        val txt = findViewById<TextView>(R.id.introTextView)

        button.setOnClickListener{
            Log.v("Hello World", getString(R.string.Button_clicked))
            Toast.makeText(this, getString(R.string.response), Toast.LENGTH_LONG).show()
            relativeLayout.setBackgroundResource(R.color.background_change)
            image.setImageResource(R.drawable.ic_launcher2_foreground)
            txt.setTextColor(resources.getColor(R.color.black))
            button.setBackgroundResource(R.color.black)

        }

    }
}




