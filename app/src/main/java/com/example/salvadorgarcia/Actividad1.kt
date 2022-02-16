package com.example.salvadorgarcia

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Actividad1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOK = findViewById<Button>(R.id.buttonOK);
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail);
        val redColorValue = Color.RED
        val whiteColorValue = Color.WHITE

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage(getString(R.string.alerta))
        builder.setPositiveButton(getString(R.string.alertaAcep), null)




        val dialog = builder.create()

        buttonOK.setOnClickListener {


            var mail = editTextEmail.text.toString();
            val intent = Intent(this, Actividad2::class.java)
            intent.putExtra("mail", mail)

            if(mail == "" || mail == " " || !mail.contains("@")){
                dialog.show()
            }else{
                startActivity(intent)
                editTextEmail.setTextColor(whiteColorValue)
            }
        }

    }

}