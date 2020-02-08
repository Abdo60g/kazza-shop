package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.view.WindowManager
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_resetpassword.*
import java.util.regex.Pattern

class resetpassword : AppCompatActivity() {
var auth=FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resetpassword)

resetpassword.setOnClickListener {
progressBarpssword.visibility=View.VISIBLE

    window.setFlags(
        WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
        WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    myextinion().t2(this,it,R.anim.blink_anim,R.raw.click)
    var tesheck=Patterns.EMAIL_ADDRESS

   var t= Pattern.matches(tesheck.pattern(),mailtopass.text.toString().trim())


if (mailtopass.text.isNotEmpty()){
if (t){

    auth.sendPasswordResetEmail(mailtopass.text.toString().trim()).addOnCompleteListener {
        if (it.isSuccessful) {

            Snackbar.make(resetpassword,"تم ارسال رسالة تغيير كلمة السر الي بريدك الالكتروني",Snackbar.LENGTH_LONG).show()

            progressBarpssword.visibility=View.INVISIBLE

            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);


        }





}.addOnFailureListener {


    Snackbar.make(resetpassword,"رجاء التحقق من  اتصالك بالانترنت والتحقق من صحه البريدالالكتروني المدخل ",Snackbar.LENGTH_SHORT).show()

        progressBarpssword.visibility=View.INVISIBLE

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }

}
    else {

    if (!t) {
        Snackbar.make(resetpassword, "خطأ في كتابة البريد الالكتروني  ", Snackbar.LENGTH_LONG)
            .show()
        progressBarpssword.visibility=View.INVISIBLE

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }
}



}else{
    if (mailtopass.text.isEmpty()){
        Snackbar.make(resetpassword,"رجاء كتابة البريد الالكتروني  ",Snackbar.LENGTH_LONG).show()
        progressBarpssword.visibility=View.INVISIBLE

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }
}

}







    }

    override fun onBackPressed() {
        progressBarpssword.visibility=View.INVISIBLE

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        var ma=Intent(this,MainActivity::class.java)
        startActivity(ma)
            this.finish()
    }
}
