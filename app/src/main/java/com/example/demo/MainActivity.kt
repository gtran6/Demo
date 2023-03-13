package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var num: Int? = null

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = num?.let {
            val num2 = it + 1
            num2
        } ?: 3

        with(Intent()) {

        }

        val intent = Intent().apply {
            putExtra("", "")
            putExtra("", 0)
            action = ""
        }
    }

    fun getSquaredI() = (i*i).also {
        i++
    }
}
/*
- let: Used to check nulls, also better than simple null check in multi-threading case
- also: same as 'let' but it doesn't return the last line as 'let', instead 'also' will return the object it was called on and 'not the last line!'
- apply: helpful function to modify objects, if you want to change in properties of the objects, and it uses 'this' instead of 'it' as we work inside the class of the object
- run: equivalent to 'apply', but it won't return the object it was called, instead it will return the last line with: same as 'run' but a different signature.
 */