package com.colorgame

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loadImage(imageUrls: List<String>, imageViews: List<ImageView>) {
        for (i in 0 until imageUrls.size.coerceAtMost(imageViews.size)) {
            Picasso.get()
                .load(imageUrls[i])
                .into(imageViews[i])
        }
    }}