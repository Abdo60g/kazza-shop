package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_useritems.*
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import android.widget.Toast


class useritems : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_useritems)


        var af=myextinion().t(this,"hhhh")
        af
        var a1 = mutableListOf<item>()


        a1.add(item("كوتش ", "150 le", R.drawable.ditemf))
        a1.add(item("كوتش ", "200 le", R.drawable.ditemf))
        a1.add(item("كوتش ", "200 le", R.drawable.ditemf))
        a1.add(item("كوتش ", "150 le", R.drawable.dw))
        a1.add(item("كوتش ", "200 le", R.drawable.ditemf))
        a1.add(item("كوتش ", "200 le", R.drawable.ditemf))
        a1.add(item("كوتش ", "200 le", R.drawable.dw))
        a1.add(item("كوتش ", "200 le", R.drawable.ditemf))


        var a2 = itemlist(this, R.layout.exm, a1)

list.adapter=a2





       /* list.onItemClickListener = OnItemClickListener { parent, view, position, id ->

           t(position.toString())
            var a1=Intent(this,priview1::class.java)
            startActivity(a1)
        }*/

    }

    fun ad(ad: View):Unit{

        var ds= AnimationUtils.loadAnimation(this,R.anim.blink_anim)

        return ad.startAnimation(ds)
    }
    override fun onBackPressed() {
        var Intent=Intent(this,Main2Activity::class.java)
        startActivity(Intent)
        this.finish()


    }
}
