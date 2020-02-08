package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_listcustomer.*
import android.view.ViewGroup
import android.view.MotionEvent
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


class markting2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listcustomer)

        var adbter=fragmentadabter( supportFragmentManager)
        viewpager.adapter=adbter

        viewpager.setOffscreenPageLimit(7);
        horizontalScrollView2.setupWithViewPager(viewpager)       }}
