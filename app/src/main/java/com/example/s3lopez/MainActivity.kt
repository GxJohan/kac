package com.example.s3lopez

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val valA = findViewById<EditText>(R.id.etValorA)
        val valB = findViewById<EditText>(R.id.etValorB)
        val btnMul=findViewById<Button>(R.id.btnCalcular)
        val tvRes = findViewById<TextView>(R.id.tvResultado)

        btnMul.setOnClickListener {
            val a = valA.text.toString().trim()
            val b = valB.text.toString().trim()

            if (a.isNotEmpty() && b.isNotEmpty()){
                val result = a.toDouble() * b.toDouble()
                tvRes.text = "Resultado: $result "

            }
        }

    }
}