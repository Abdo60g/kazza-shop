package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Toast

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.view.animation.AnimationUtils

import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import android.text.Html
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.media.MediaPlayer
import android.opengl.Visibility
import android.view.View
import android.view.WindowManager


lateinit var sh2:SharedPreferences.Editor
 lateinit var sh11:SharedPreferences

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        textView23.setOnClickListener {

            var g=Intent(this,resetpassword::class.java)
            startActivity(g)
            this.finish()

        }


        val first = "ليس لدي حساب؟ "
        val next = "<font color='#E23A3A'>انشاء</font>"
        tx1.setText(Html.fromHtml(first + next))
        var a1 = FirebaseAuth.getInstance()


        var shx1 = this.getSharedPreferences("sh12", Context.MODE_PRIVATE)!!

        sh11 = getSharedPreferences("sh12", Context.MODE_PRIVATE)

        sh2 = shx1.edit()

        sh2.apply()

        var x4 = sh11.getString("1e", "")
        var x5 = sh11.getString("2e", "")
        var x6 = sh11.getBoolean("e3", false)

        if (x6 == true) {
            if (x4!!.isNotEmpty() && x5!!.isNotEmpty()) {
                a1.signInWithEmailAndPassword(x4!!, x5!!)

                var a1 = Intent(this, Main2Activity::class.java)
                startActivity(a1)
                this.finish()
            }
        }



        rectangle_2.setOnClickListener {

myextinion().t2(this,it,R.anim.blink_anim,R.raw.click2)

progressBar.visibility=View.VISIBLE
            window.setFlags(
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            if (et1.text.trim().isNotEmpty() && et2.text.trim().isNotEmpty()) {


                a1.signInWithEmailAndPassword(et1.text.toString().trim(), et2.text.toString().trim())
                    .addOnSuccessListener {
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);



                        if (a1.currentUser!!.isEmailVerified == true) {
                            sh2?.putString("1e", et1.text.toString().trim())?.apply()
                            sh2?.putString("2e", et2.text.toString().trim())?.apply()
                            sh2?.putBoolean("e3", true).apply()
                            this.finish()
                            var a1 = Intent(this, Main2Activity::class.java)
                            startActivity(a1)
                        }
                        if (a1.currentUser!!.isEmailVerified == false) {

                            t("this email not verified")
                            var a1 = Intent(this, verifyemail::class.java)
                            startActivity(a1)
                            finish()


                        }


                    }.addOnFailureListener {
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                    myextinion().t(this,"error in login")

                        progressBar.visibility=View.INVISIBLE

                }


            } else {

                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                progressBar.visibility=View.INVISIBLE
                t("Error to login")
            }


        }

myextinion().t4(et2,"كلمة السر")

        im1.setOnClickListener {

            if (im1.isChecked) {
                et2.inputType = InputType.TYPE_CLASS_TEXT

                et2.setSelection(et2.text.length)
            } else if (!im1.isChecked) {
                et2.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                et2.setSelection(et2.text.length)


            }
        }





            tx1.setOnClickListener {

                val first = "ليس لدي حساب؟ "
                val next = "<font color='#1E3FC4'>انشاء</font>"
                tx1.setText(Html.fromHtml(first + next))

                var a1 = Intent(this, signup::class.java)
                startActivity(a1)

                this.finish()

            }




    }

    fun t( qt:String) :Unit{

        return Toast.makeText(this,"$qt",Toast.LENGTH_LONG).show()
    }
}




