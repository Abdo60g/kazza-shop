package com.example.myapplication

import android.app.Notification
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_userselect.*

import android.net.Uri
import java.net.URLEncoder
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Base64
import android.widget.Toast
import java.util.*
import androidx.core.app.ComponentActivity
import com.bumptech.glide.Glide


class userselect : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userselect)

  var a1= sh11.getString("imageview",null)
Glide.with(this).load(a1).into(imageView24)
/*       var adecode=Base64.decode(sh?.toByteArray(),Base64.DEFAULT)

        var bitmap=BitmapFactory.decodeByteArray(adecode,0,adecode.size)
        imageView24.setImageBitmap(bitmap)
*/
imageView22.setOnClickListener {


        val packageManager = this.getPackageManager()
        val i = Intent(Intent.ACTION_VIEW)

        try {
            val url = "https://api.whatsapp.com/send?phone=" + "+201009093411" + "&text=" + URLEncoder.encode(
                "hi",
                "UTF-8"
            )
            i.setPackage("com.whatsapp")
            i.data = Uri.parse(url)
            if (i.resolveActivity(packageManager) != null) {
                this.startActivity(i)
            }
        }

    catch (e: Exception) {
myextinion().t(this,"Whatsapp not found")
    }}
    imageView21.setOnClickListener {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:01009093411")
        startActivity(intent)

    }



    }

    override fun onBackPressed() {
        var Intent=Intent(this,listcustomer::class.java)
        startActivity(Intent)

       var a1=sh11.getInt("position",0)
        var a2= sh2.putInt("position2",a1).apply()
        a2

        this.finish()


    }
}
