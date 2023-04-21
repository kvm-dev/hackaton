package com.colorgame

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.Log

class ColorRecognition(private val image: Bitmap) {

    fun recognizeImage(): Bitmap {
        val newImage = Bitmap.createBitmap(image.width, image.height, Bitmap.Config.ARGB_8888)
        val mutableBitmap: Bitmap = newImage.copy(Bitmap.Config.ALPHA_8, true)
        mutableBitmap.width = 255
        mutableBitmap.height = 255
        val canvas = Canvas(newImage)
        canvas.drawBitmap(image, 0f, 0f, null)
        val paint = Paint().apply {
            isAntiAlias = true
            style = Paint.Style.FILL
        }
        for (x in 0 until mutableBitmap.width) {
            for (y in 0 until mutableBitmap.height) {
                val pixelColor = image.getPixel(x, y)
                //Log.d("ColorRecognition", "Pixel color at ($x, $y): $red, $green, $blue")
                paint.color = pixelColor
                canvas.drawRect(Rect(x, y, x+1, y+1), paint)
            }
        }
        return newImage
    }


}
