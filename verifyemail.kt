package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_verifyemail.*

class verifyemail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifyemail)
verify.setOnClickListener {
    var a1f=AnimationUtils.loadAnimation(this,R.anim.blink_anim)
    verify.startAnimation(a1f)
        var a1=FirebaseAuth.getInstance().currentUser
        a1?.sendEmailVerification()?.addOnSuccessListener {
t("تم ارسال رسالة التأكيد")
            var a2=FirebaseAuth.getInstance()
            a2.signOut()
            finish()


        }?.addOnFailureListener {
          t("خطأ في ارسال رسالة التأكيد")

        }

    }}
    fun t( qt:String) :Unit{

        return Toast.makeText(this,"$qt", Toast.LENGTH_LONG).show()
    }
}
