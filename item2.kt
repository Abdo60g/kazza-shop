package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableWrapper
import android.os.Bundle
import android.provider.MediaStore
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import com.bumptech.glide.Glide
import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.io.OutputStreamWriter

class item2(var e1:String, var e3:String) {

}
class itemlist2(var z: Context, var z2:Int, var Z3:MutableList<item2>): ArrayAdapter<item2>(z,z2,Z3){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var t1= LayoutInflater.from(z).inflate(z2,null)

        var t2: ImageView =t1.findViewById(R.id.imageViewitem2)
        var t4: TextView =t1.findViewById(R.id.textView12)


        var t6:item2=Z3[position]

        //t2.setImageResource(t6.e3)
Glide.with(z).load(t6.e3).into(t2)
//var tbitmab=t2.drawable
        t4.text=t6.e1

        setNotifyOnChange(true)

        return t1



    }





    override fun notifyDataSetChanged() {
        sh2.remove("position2").apply()
sh2.remove("position").apply()
        super.notifyDataSetChanged()
    }

    override fun setNotifyOnChange(notifyOnChange: Boolean) {
        sh2.remove("position2").apply()
        sh2.remove("position").apply()
        super.setNotifyOnChange(notifyOnChange)
    }


}