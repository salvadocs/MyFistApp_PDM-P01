package com.example.salvadorgarcia

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        val mailText = findViewById<TextView>(R.id.mailText);
        val switch1 = findViewById<Switch>(R.id.switch1);
        val textView4 = findViewById<TextView>(R.id.textView4);

        val objetoIntent: Intent=intent

        var mail = objetoIntent.getStringExtra("mail")
        mailText.text = "$mail"

        switch1.setOnCheckedChangeListener{ compoudButton, isCheked->

            if (isCheked){
                mailText.setVisibility(View.INVISIBLE)
                textView4.setVisibility(View.INVISIBLE)
            }
            else{
                mailText.setVisibility(View.VISIBLE)
                textView4.setVisibility(View.VISIBLE)
            }


        }

    }
}