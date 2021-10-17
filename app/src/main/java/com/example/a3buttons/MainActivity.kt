package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTv.setOnClickListener {
                val text="${ed1.text} | ${ed2.text} | ${ed3.text}"
                textView.text=text
        }
        btnToast.setOnClickListener {
                val text="${ed1.text} | ${ed2.text} | ${ed3.text}"
                Toast.makeText(applicationContext, "$text", Toast.LENGTH_SHORT).show()
        }
        btnGo.setOnClickListener {

                val text="${ed1.text} | ${ed2.text} | ${ed3.text}"
                var intent=Intent(applicationContext,Page2::class.java)
                intent.putExtra("text",text)
                startActivity(intent)

        }
    }


}