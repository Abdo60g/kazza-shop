package com.example.myapplication


import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.AdapterView
import android.widget.GridView
import android.widget.PopupWindow
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_listcustomer.*
import kotlinx.android.synthetic.main.activity_listcustomer.view.*
import kotlinx.android.synthetic.main.activity_userselect.view.*
import kotlinx.android.synthetic.main.fragment_blank.view.*

/**
 * A simple [Fragment] subclass.
 */
@Suppress("DEPRECATED_IDENTITY_EQUALS")
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        listcustomer().callingActivity

        var view= inflater.inflate(R.layout.fragment_blank, container, false)


        var a1 = mutableListOf<item2>()

        a1.add(item2("150 le","https://images-na.ssl-images-amazon.com/images/I/91bQYhS1yQL._UX500_.jpg"))
        a1.add(item2("150 le","https://dks.scene7.com/is/image/dkscdn/19NIKMDWNSHFTR9RDRNN_Black_White_is?wid=1080&fmt=jpg"))
        a1.add(item2("150 le","https://scene7.zumiez.com/is/image/zumiez/pdp_hero/Champion-Men-s-Rally-Pro-Black-%26-White-Shoes-_298256.jpg"))
        a1.add(item2("150 le","https://scene7.zumiez.com/is/image/zumiez/pdp_hero/Champion-Men-s-Rally-Pro-Black-%26-White-Shoes-_298256.jpg"))
        a1.add(item2("150 le","https://scene7.zumiez.com/is/image/zumiez/pdp_hero/Champion-Men-s-Rally-Pro-Black-%26-White-Shoes-_298256.jpg"))
        a1.add(item2("150 le","https://scene7.zumiez.com/is/image/zumiez/pdp_hero/Champion-Men-s-Rally-Pro-Black-%26-White-Shoes-_298256.jpg"))
        a1.add(item2("150 le","https://dks.scene7.com/is/image/dkscdn/19NIKMDWNSHFTR9RDRNN_Black_White_is?wid=1080&fmt=jpg"))



        var adabter=itemlist2(activity!!.applicationContext,R.layout.exm2,a1)
        view.g215.adapter=adabter

        /*view.g215.setOnTouchListener { view, motionEvent ->
            var x1 = motionEvent.x
            var y1 = motionEvent.y
            var a = Bundle()
            a.putInt("x", x1.toInt())
            a.putInt("y", y1.toInt())
            true
        }*/





        var g=view.g215
        var agetpostion= sh11.getInt("position2",0)

       g.smoothScrollToPosition(agetpostion+2)
        adabter.notifyDataSetChanged()





        view.g215.onItemClickListener=AdapterView.OnItemClickListener{
            parent, view, position, id ->


var a:item2=a1[position]

            var ac=sh2.putString("imageview",a.e3).apply()
sh2.putInt("position",position).apply()



            var a1 = Intent(activity!!.applicationContext, userselect::class.java)


            startActivity(a1)

activity!!.finish()

    }





    return view
    }
    /*fun setGridViewHeightBasedOnChildren(gridView: GridView, columns:Int) {
        val listAdapter = gridView.getAdapter()
        if (listAdapter == null)
        {
            // pre-condition
            return
        }
        var totalHeight = 0
        var items = listAdapter.getCount()
        var rows = 0
        var listItem = listAdapter.getView(0, null, gridView)
        listItem.measure(0, 0)
        totalHeight = listItem.getMeasuredHeight()
        var x = 1f
        if (items > columns)
        {
            x = (items / columns).toFloat()
            rows = (x + 1).toInt()
            totalHeight *= rows
        }
        val params = gridView.getLayoutParams()
        params.height = totalHeight
        gridView.setLayoutParams(params)
    }
*/


}
