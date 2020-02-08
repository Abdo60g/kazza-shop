package com.example.myapplication

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main2.*
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import com.google.firebase.auth.FirebaseAuth


class Main2Activity : AppCompatActivity() {
private var helper2=DatabaseHelper(this)
private var fauth=FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val res1 = helper2.allData


        if (res1.count ==0){
            Toast.makeText(this,"No records :(", Toast.LENGTH_LONG).show()
        }
        while (res1.moveToNext()) {


            var ag=Base64.decode(res1.getBlob(5),Base64.DEFAULT)
            textView5.text=res1.getString(1)
            Toast.makeText(this,res1.getString(1),Toast.LENGTH_SHORT).show()

            var a4=BitmapFactory.decodeByteArray(ag,0,ag.size)

            imageView4.background=a4.toDrawable(resources)


        }









        imageView19.setOnClickListener {
        buton(it)
         var a1= Intent(this,Main3Activity::class.java)
         startActivity(a1)
            this.finish()
        }

      imageView26.setOnClickListener {
          buton(it)

          var a=Intent(this,useritems::class.java)
          startActivity(a)
          this.finish()


      }
        imageView27.setOnClickListener {
            buton(it)
            this.finish()

        var aprview=Intent(this,priview1::class.java)
            startActivity(aprview)
            this.finish()


        }
        imageView28.setOnClickListener {
            buton(it)

            var Intent=Intent(this,listcustomer::class.java)

            startActivity(Intent)
            this.finish()

        }
        imageView29.setOnClickListener {
            buton(it)

            var Intent=Intent(this,markting2::class.java)
            startActivity(Intent)
            this.finish()

        }
        imageView30.setOnClickListener {
            buton(it)

             fauth.signOut()
progressBar1.visibility=View.VISIBLE
            window.setFlags(

                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);


            var a=Thread{

                Thread.sleep(3000)
                sh11.all.clear()
                sh2.clear().apply()
                this.finish()
            }
            a.start()
        }


    }

    override fun onBackPressed() {
System.exit(0)
    }
    fun buton(y:View){
        myextinion().t2(this,y,R.anim.blink_anim,R.raw.click)


    }

}
