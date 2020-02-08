package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.text.Selection
import android.view.Gravity
import android.view.MenuItem
import android.view.animation.AnimationUtils
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.regex.Pattern

class signup : AppCompatActivity() {

    var auth=FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val first = "بانشاء الحساب تصبح ملتزم  "
        val next = "<font color='#1E3FC4'><i>بشروط التطبيق</i></font>"
        textView.setText(Html.fromHtml(first + next))

myextinion().t4(editText4,"كلمة السر")
        myextinion().t4(editText5,"تأكيد كلمة السر")

        button2.setOnClickListener {

 var a2d=AnimationUtils.loadAnimation(this,R.anim.blink_anim)
            button2.startAnimation(a2d)
            var aco=1
            if ((editText2.text.trim().isNotEmpty() && editText5.text.trim().isNotEmpty()) && (editText4.text.trim().isNotEmpty()) && editText5.text.trim().isNotEmpty()) {

              if (editText.text.isEmpty()){

                  t("رجاء ادخال الاسم")
                  aco=0
              }

                if (editText4.text.trim() != editText5.text.trim() ){
                    t("الرقم السري غير متطابق")

                    aco=0


                }

                if(editText2.text.trim() != editText3.text.trim()) {

                t("البريد الاكتروني غير متطابق")

                    aco=0

                }


                if (editText5.text.length<6){
                    t("كلمة السر ضعيفه")
                    aco=0
                }
                var adds:Boolean=Pattern.matches("[a-zA-Zء-ي]+\\s+[a-zA-Zء-ي]+|[a-zA-Zء-ي]+|[a-zA-Zء-ي]+\\s+[a-zA-Zء-ي]+\\s[a-zA-Zء-ي]+",editText.text.trim())


                if (adds==false){

                    t("رجاء ادخال اسم المحل صحيحا بدون ارقام ")
                    aco=0
                }


            } else {

                Toast.makeText(this, "رجاء ادخال جميع البيانات", Toast.LENGTH_LONG).show()
aco=0
            }



       if (aco==1){

           auth.createUserWithEmailAndPassword(editText3.text.trim().toString(),editText5.text.trim().toString()).addOnSuccessListener {
               t("تم انشاء حسابك")


           }.addOnFailureListener {
               exception ->
               var ad=exception.message


               when(ad){

                   "ERROR_INVALID_EMAIL", "The email address is badly formatted."-> t("رجاء ادخال البريد الاكتروني صحيحا")
                   "ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."-> t("هذا البريد مستخدم بالفعل")

               }




           }

       }

        }




        imageView3.setOnClickListener {

            onBackPressed()

        }




        }





    override fun onBackPressed() {

        auth.signOut()
        var a1= Intent(this,MainActivity::class.java)
        startActivity(a1)
        this.finish()

    }
    fun t( qt:String) :Unit{

        return Toast.makeText(this,"$qt",Toast.LENGTH_LONG).show()
    }
}
