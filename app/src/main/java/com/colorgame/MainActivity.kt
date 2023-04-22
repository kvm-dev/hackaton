package com.colorgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    val viewModel by lazy { ViewModelProvider(this)[MainViewModel::class.java]}

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val test = findViewById<TextView>(R.id.textView)
            test.setOnClickListener {
                viewModel.getLevel()
            }
            viewModel.result.observe(this) {
                if (it != null) {
                    Log.d("ответ", "${it.success}")
                }
            }
        }

}