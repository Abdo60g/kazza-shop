package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableWrapper
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.BitmapCompat
import androidx.core.graphics.drawable.toBitmap
import kotlinx.android.synthetic.main.activity_priview.view.*
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

class item(var e1:String,var e2:String,var e3:Int) {

}

class itemlist(var z:Context, var z2:Int, var Z3:MutableList<item>):ArrayAdapter<item>(z,z2,Z3){
 lateinit var imageView: Drawable
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
   var t1=LayoutInflater.from(z).inflate(z2,null)

        var t2:ImageView=t1.findViewById(R.id.imageView9)
        var t5:TextView=t1.findViewById(R.id.textView11)
        var t9:TextView=t1.findViewById(R.id.textView8)
        var t7:ImageView=t1.findViewById(R.id.imageView10)
        var t8:ImageView=t1.findViewById(R.id.imageView11)

        var t6:item=Z3[position]
        t2.setImageResource(t6.e3)
        t9.text=t6.e1

        t5.text=t6.e2
imageView=t2.drawable
        t7.setOnClickListener {
            Toast.makeText(z,"hi",Toast.LENGTH_SHORT).show()
ad(t7)
        }
        t8.setOnClickListener {
            ad(t8)
        }

        return t1



    }


    fun ad(ad: View):Unit{

        var ds= AnimationUtils.loadAnimation(z,R.anim.blink_anim)

        return ad.startAnimation(ds)
    }

}
