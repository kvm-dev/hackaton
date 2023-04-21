package com.colorgame

import android.graphics.*
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.colorgame.databinding.ActivityMainBinding
import com.colorgame.model.Pixel
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val pixels = mutableListOf<Pixel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pixel()
        pixel2()


        val imageBitmap = BitmapFactory.decodeResource(resources, R.drawable.image3)
        val colorRecognition = ColorRecognition(imageBitmap)
        val newImageBitmap = colorRecognition.recognizeImage()

        binding.firstImage.setImageBitmap(newImageBitmap)



    }



    private fun pixel2() {
//        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.noimage)
//        val imageProcessor = ImageProcessor()
//        val pixels = imageProcessor.getPixels(bitmap)
//
//        val colorAnalyzer = ColorAnalyzer()
//        val matchingPixels = colorAnalyzer.getMatchingPixels(pixels, "#FF0000")
//
//        for (pixel in matchingPixels) {
//            val x = pixel.first
//            val y = pixel.second
//            val pixelColor = pixels[y][x]
//            Log.d("pixel", pixelColor.toString())
//            // do something with x, y, and pixelColor
//        }

//        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.noimage)
//        val imageAnalyzer = ImageAnalyzer(bitmap)
//
//        val colorsToMatch = listOf(Color.RED, Color.GREEN, Color.BLUE)
//        val matchedPixels = imageAnalyzer.analyzeImage(colorsToMatch)
//
//        for ((x, y) in matchedPixels) {
//            val pixelColor = bitmap.getPixel(x, y)
//            val colorName = getColorName(pixelColor)
//            Log.d("TAG", "Pixel at ($x, $y) has color $colorName")
//        }
//
//        val pixelsWithRedColor = getPixelsWithColor(bitmap, Color.RED)
//        val pixelsWithGreenColor = getPixelsWithColor(bitmap, Color.GREEN)

    }

    private fun pixel() {
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.image3)
        val newImage = Bitmap.createBitmap(bitmap.width, bitmap.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(newImage)
        canvas.drawBitmap(bitmap, 0f, 0f, null)
        val paint = Paint().apply {
            isAntiAlias = true
            style = Paint.Style.FILL
        }

        val mutableBitmap: Bitmap = bitmap.copy(Bitmap.Config.ALPHA_8, true)
       mutableBitmap.width = 255
        mutableBitmap.height = 255

        for (x in 0 until        mutableBitmap.width) {
            for (y in 0 until mutableBitmap.height) {
                val pixelColor = bitmap.getPixel(x, y)
                val red = Color.red(pixelColor)
                val green = Color.green(pixelColor)
                val blue = Color.blue(pixelColor)

                Log.d("ColorRecognition", "Pixel color at ($x, $y): $red, $green, $blue")
                pixels.add(Pixel(x, y, red, green, blue))
                paint.color = pixelColor
                canvas.drawRect(Rect(x, y, x+1, y+1), paint)
            }
        }

        Log.d("PixelData", pixels.toString())
    }
//        for (x in 0 until bitmap.width) {
//            for (y in 0 until bitmap.height) {
//                val pixel = bitmap.getPixel(x, y)
//                val yellow = Color.YELLOW
//                val red = Color.red(pixel)
//                val green = Color.green(pixel)
//                val blue = Color.blue(pixel)
//
//                if (red > threshold && green < threshold && blue < threshold) {
//                    // пиксель является "красным", сохраняем его координаты
//                    val pixelCoordinates = Pair(x, y)
//                    pixels.add(Pixel(pixelCoordinates.first, pixelCoordinates.second, red))
//                    // здесь вы можете использовать pixelCoordinates для дальнейшей обработки пикселя
//                }
//
//            }
//        }
        //Log.d("Pixel", pixels.toString())
fun loadImage(imageUrls: List<String>, imageViews: List<ImageView>) {
    for (i in 0 until imageUrls.size.coerceAtMost(imageViews.size)) {
        Picasso.get()
            .load(imageUrls[i])
            .into(imageViews[i])
            }
        }
    }


