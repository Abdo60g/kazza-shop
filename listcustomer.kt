package com.example.myapplication

import android.app.ActionBar
import android.content.Context
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_listcustomer.*
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_listcustomer.button4
import kotlinx.android.synthetic.main.activity_listcustomer.imageView132

import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_frammenuu.view.*
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.LinearLayout

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
















 lateinit var rocketAnimation: AnimationDrawable


class listcustomer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listcustomer)
        var shlistcustomer = getSharedPreferences("sh12", Context.MODE_PRIVATE)


        var tv =  ConstraintLayout(getApplicationContext());

        var adbter=fragmentadabter( supportFragmentManager)
        viewpager.adapter=adbter

        viewpager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {


            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {






            }
            override fun onPageSelected(position: Int) {

                var numpage= sh2.putInt("numpage",position).apply()

            }

        })
        adbter.notifyDataSetChanged()

        viewpager.setOffscreenPageLimit(7);

     var numpage2:Int?= shlistcustomer.getInt("numpage",0)

      viewpager.setCurrentItem(numpage2!!,true)






        horizontalScrollView2.setupWithViewPager(viewpager)
      bt(button4,R.anim.blink_anim)
        bt(button41,R.anim.lefttoright)
        bt(imageView132,R.anim.zoomin)

        button4.setOnClickListener {
            it.background=resources.getDrawable(R.drawable.te)
        }

    }





    fun bt(a:View,ad2: Int){
        a.setOnClickListener {
            var ds= AnimationUtils.loadAnimation(this,ad2)
            a.startAnimation(ds)
            when (a){

                button4->{
                    val layoutInflater = this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


                    var layout =layoutInflater.inflate(R.layout.activity_frammenuu,null)


                    var a=PopupWindow(layout, ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT,true)











                    a.setFocusable(true);
                    a.animationStyle=R.style.popup_window_animation_phone
                    a.showAsDropDown(ff,0,0,Gravity.START)
    layout.findViewById<TextView>(R.id.textView13).setOnClickListener {

                        t("ffffffffffffff")
                    }

                    layout.findViewById<ImageView>(R.id.imageView12).setOnClickListener {

                        a.dismiss()
                    }

                }
                button41 ->{

                    var a1=PopupMenu(this,button41)
                    a1.inflate(R.menu.menu5)
                    a1.show()
a1.setOnMenuItemClickListener {
    when(it.itemId){
        1 ->{
            t("cxxc")
        }
        2->{
            t("dsd")
        }

    }
        true
}
                }
                imageView132->{


true
}



}}}
fun t( qt:String) :Unit{

return Toast.makeText(this,"$qt", Toast.LENGTH_LONG).show()
}
override fun onBackPressed() {
    sh2.remove("position2").apply()
    sh2.remove("numpage").apply()

    var Intent= Intent(this,Main2Activity::class.java)

startActivity(Intent)
this.finish()


}

}