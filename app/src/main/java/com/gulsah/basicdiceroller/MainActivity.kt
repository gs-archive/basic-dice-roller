package com.gulsah.basicdiceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zar1Text : TextView = findViewById(R.id.zar1Text)
        val zar2Text : TextView = findViewById(R.id.zar2Text)
        val zar1Image : ImageView = findViewById(R.id.zar1Image)
        val zar2Image : ImageView = findViewById(R.id.zar2Image)
        val zarAtButton : Button = findViewById(R.id.zarAtButton)
        val temizleButton : Button = findViewById(R.id.temizleButton)



        zarAtButton.setOnClickListener {
            var sayi1 = randomSayi()
            var sayi2 = randomSayi()

            while (true) {
                if (sayi1 == sayi2) sayi1 = randomSayi()
                else break
            }
            zar1Text.text = sayi1.toString()
            zar2Text.text = sayi2.toString()
            when(sayi1){
                1-> zar1Image.setImageResource(R.drawable.dice_1)
                2-> zar1Image.setImageResource(R.drawable.dice_2)
                3-> zar1Image.setImageResource(R.drawable.dice_3)
                4-> zar1Image.setImageResource(R.drawable.dice_4)
                5-> zar1Image.setImageResource(R.drawable.dice_5)
                else -> zar1Image.setImageResource(R.drawable.dice_6)
            }
            when(sayi2){
                1-> zar2Image.setImageResource(R.drawable.dice_1)
                2-> zar2Image.setImageResource(R.drawable.dice_2)
                3-> zar2Image.setImageResource(R.drawable.dice_3)
                4-> zar2Image.setImageResource(R.drawable.dice_4)
                5-> zar2Image.setImageResource(R.drawable.dice_5)
                else -> zar2Image.setImageResource(R.drawable.dice_6)

            }
        }

        temizleButton.setOnClickListener {
            zar1Text.text = "0"
            zar2Text.text = "0"
            zar1Image.setImageResource(R.drawable.empty_dice)
            zar2Image.setImageResource(R.drawable.empty_dice)
        }

    }





}

fun randomSayi() : Int{
    return (1..6).random()
}
