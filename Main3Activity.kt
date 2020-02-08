package com.example.myapplication

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.view.animation.AnimationUtils
import android.widget.TextView
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import kotlinx.android.synthetic.main.activity_main3.*
import java.io.ByteArrayOutputStream
import android.content.Intent

import android.provider.MediaStore

import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage


class Main3Activity : AppCompatActivity() {
    internal var helper = DatabaseHelper(this)
 var a1=myextinion()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var a=FirebaseStorage.getInstance().getReference("images/").child("a.png")
        a.downloadUrl.addOnCompleteListener {

            Glide
                .with(this)
                .load(it)

                .into(imageView43)
            it.addOnCompleteListener {
                Toast.makeText(this,it.toString(),Toast.LENGTH_SHORT).show()
            }


        }

        textView3s.setOnClickListener {


            CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .start(this)


       }


        val res1 = helper.allData

        if (res1.count ==0){
            Toast.makeText(this,"No records :(", Toast.LENGTH_LONG).show()
        }
        while (res1.moveToNext()) {


            var ag=Base64.decode(res1.getBlob(5),Base64.DEFAULT)

            var a4=BitmapFactory.decodeByteArray(ag,0,ag.size)

            imageView43.background=a4.toDrawable(resources)


        }


textView9.setOnClickListener {
   ad(textView9)
}
        a1.t5(textView73,"رقم الهاتف...")
        a1.t5(textView83,"مواعيد العمل و وصف المحل والعنوان اذا امكن..")

    }
    fun ad(ad: TextView):Unit{

        var ds= AnimationUtils.loadAnimation(this,R.anim.blink_anim)

        return ad.startAnimation(ds)
    }
    /*fun adf(){
        var t=imageView43.drawable as BitmapDrawable
        var sdf= ByteArrayOutputStream()
        var t1=t.bitmap
        t1.compress(Bitmap.CompressFormat.JPEG,80,sdf)
        var t3=sdf.toByteArray()
        aa.insert("hi",t3)



    }*/

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == Activity.RESULT_OK) {
                val resultUri = result.uri
                val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, resultUri)
try {


                var d = BitmapDrawable(resources, bitmap)
//تغيير حجم الصوره
                val bitmap2 = Bitmap.createScaledBitmap(bitmap,imageView43.width,imageView43.height,true)










                var sdf=ByteArrayOutputStream()
                var sdf2=d.toBitmap()
                sdf2.compress(Bitmap.CompressFormat.PNG,70,sdf)
                var sdf3=sdf.toByteArray()
                var dss= Base64.encode(sdf3, Base64.DEFAULT)

    val storageRef = FirebaseStorage.getInstance().getReference("images/")
   var d2= storageRef.child("a.png")

d2.putBytes(sdf3).addOnFailureListener{

    Toast.makeText(this,"ffgv",Toast.LENGTH_LONG).show()
}.addOnCompleteListener{
    Toast.makeText(this,"done",Toast.LENGTH_LONG).show()

}




                helper.insertData(
                    "لطفي",
                    "c",
                    "d","DS",
                    dss)}  catch (e:Exception){
    myextinion().t(this,"خطاء في تحميل الصورة")
}
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                val error = result.error
            }
        }
    }
    override fun onBackPressed() {
        var Intent=Intent(this,Main2Activity::class.java)
        startActivity(Intent)
        this.finish()


    }

    override fun onStart() {

        super.onStart()
    }
}
