package com.example.myapplication

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_priview.*
import kotlinx.android.synthetic.main.activity_priview.view.*
import kotlinx.android.synthetic.main.activity_priview.view.imageView4p
import java.util.*
import android.R.attr.bitmap
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.DrawableWrapper
import android.provider.MediaStore
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import kotlinx.android.synthetic.main.activity_main3.*
import java.io.ByteArrayOutputStream
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.widget.TextView


class priview1 : AppCompatActivity() {
private var ktext=""
    private var imaget=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priview)
        one1.setOnClickListener {
            selet(one1)
            buton(it)


        }
        two1.setOnClickListener {
            selet(two1)


            buton(it)


        }
        three1.setOnClickListener {

            selet(three1)
            buton(it)

        }
        four1.setOnClickListener {

            selet(four1)
            buton(it)

        }
        five1.setOnClickListener {

            selet(five1)
            buton(it)

        }
        six1.setOnClickListener {

            selet(six1)
            buton(it)

        }
        seven1.setOnClickListener {

            selet(seven1)
            buton(it)

        }

        imageView2.setOnClickListener {
            CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .start(this);


        }
button.setOnClickListener {
        if (textView7.text.isNotEmpty()&&ktext!=""&&imaget!=""){

            myextinion().t(this,"تم")

        }


        else{if (imaget==""){
            myextinion().t(this,"رجاء اختيار صوره المنتج")

        }
            if (textView7.text.isEmpty()){
                myextinion().t(this,"رجاء كتابة السعر")

            }
            if (ktext=="")
            myextinion().t(this,"رجاء تحديد النوع")
        }

    }

    }


    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == Activity.RESULT_OK) {
                val resultUri = result.uri
                val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, resultUri)

                var d = BitmapDrawable(resources, bitmap)
var bitmap2=Bitmap.createScaledBitmap(bitmap,bitmap.width,bitmap.height,true)
                imageView4p.setImageBitmap(d.bitmap)
                imageView4p.background=null

imaget=bitmap.toString()

            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                val error = result.error
                myextinion().t(this,"ابعاد الصورة غير مناسبة")
            }
        }
    }

fun selet(k:TextView) :Unit{

       one1.setTextColor(Color.BLACK)
       two1.setTextColor(Color.BLACK)
       three1.setTextColor(Color.BLACK)
       four1.setTextColor(Color.BLACK)
       five1.setTextColor(Color.BLACK)
       six1.setTextColor(Color.BLACK)
       seven1.setTextColor(Color.BLACK)
    myextinion().t(this,k.text.toString())

ktext=k.text.toString()

 return k.setTextColor(Color.RED)


}override fun onBackPressed() {
        var Intent=Intent(this,Main2Activity::class.java)
        startActivity(Intent)
                   this.finish()


    }
    fun buton(y:View){
        myextinion().t2(this,y,R.anim.blink_anim,R.raw.click)


    }
}
