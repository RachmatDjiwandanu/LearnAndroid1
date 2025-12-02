package com.danu.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var angka: Int = 10
    val angkaDecimal: Double = 10.5

    val karakter: Char = 'D'
    val nama: String = "Rachmat Djiwandanu"

    val benar: Boolean = true
    val salah: Boolean = false

    val arrayAngka: Array<Int> = arrayOf(0, 1, 2, 3)
    val stringArray: Array<String> = arrayOf("Danu", "Sedang", "Belajar")

//    Tipe data null(menggunakan tanda "?" setelah tipe datanya)
    val nullAngka: Int? = null

    fun hitung(){
        angka++
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val loadText: TextView = findViewById(R.id.load_text)
        val countBtn: Button = findViewById(R.id.count_btn)

        countBtn.setOnClickListener {
            hitung()
            loadText.text = angka.toString()
        }



//        if (angka >= 10 && nama == "Rachmat Djiwandanu"){
//            print("Aku adalah" + nama + " dan umur saya adalah " + angka)
//        }else{
//            print("salah bjir")
//        }
//
        }
    }