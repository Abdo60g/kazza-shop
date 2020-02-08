package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var thread=Thread{

            Thread.sleep(1200)
            var ainte=Intent(this,MainActivity::class.java)
            startActivity(ainte)
           this.finish()


        }
        thread.start()
    }
}
