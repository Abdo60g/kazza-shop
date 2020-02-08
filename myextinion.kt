package com.example.myapplication

import android.content.Context
import android.media.MediaPlayer
import android.text.GetChars
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.Toast

class myextinion {

    fun t( clas:Context,qt:String) :Unit{

        return Toast.makeText(clas,"$qt", Toast.LENGTH_LONG).show()

    }

  fun t2(clas: Context,d:View,a:Int,s:Int):Unit{


      var mymusic= MediaPlayer.create(clas,s)
      mymusic.start()
      var df=AnimationUtils.loadAnimation(clas,a)
      d.startAnimation(df)

  }
    fun t3(view:EditText){
        view.setOnFocusChangeListener { view1, b ->
            view.hint=""

        }



    }
    fun t4(view: EditText,s:String){
        view.setOnFocusChangeListener { view0, b ->
view.hint=""
            view.textAlignment=View.TEXT_ALIGNMENT_VIEW_START
            if (b==false){
                view.hint=s
                view.textAlignment=View.TEXT_ALIGNMENT_VIEW_END

            }

        }


    }
    fun t5(view: EditText,s:String){
        view.setOnFocusChangeListener { view0, b ->
            view.hint=""
            if (!b){
                view.hint=s

            }

        }


    }

}