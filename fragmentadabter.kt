package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_blank.view.*

class fragmentadabter(d:FragmentManager): FragmentPagerAdapter(d) {

    override fun getItem(position: Int): Fragment? {
        when(position){
            0->{
                var afrag=BlankFragment()
                var abundle=Bundle()

                abundle.putInt("fragitem",position)

                afrag.arguments=abundle

                return afrag

            }
1->{
      var afrag1=BlankFragment2()
      var abundle=Bundle()

      abundle.putInt("fragitem2",position)

      afrag1.arguments=abundle

      return afrag1

  }
            2->{

                var afrag1=BlankFragment3()
                var abundle=Bundle()

                abundle.putInt("fragitem2",position)

                afrag1.arguments=abundle

                return afrag1

            }
  3->{

      var afrag=BlankFragment4()
      var abundle=Bundle()

    abundle.putInt("fragitem3",position)

      afrag.arguments=abundle

      return afrag
  }
  4->{

      var afrag=BlankFragment5()
      var abundle=Bundle()

      abundle.putInt("fragitem4",position)

      afrag.arguments=abundle

      return afrag
  }
  5->{

      var afrag=BlankFragment6()
      var abundle=Bundle()

      abundle.putInt("fragitem5",position)

      afrag.arguments=abundle

      return afrag
  }

  6->{
       var afrag=BlankFragment7()
      var abundle=Bundle()

      abundle.putInt("fragitem6",position)

      afrag.arguments=abundle

      return afrag

  }




}

return null
}

override fun getCount(): Int {
return 7   }

override fun getPageTitle(position: Int): CharSequence? {



return "title${position+1}"

}

override fun getPageWidth(position: Int): Float {


return super.getPageWidth(position)
}
override fun getItemPosition(`object`: Any): Int {



return PagerAdapter.POSITION_NONE
}



override fun notifyDataSetChanged() {


super.notifyDataSetChanged()
}

override fun finishUpdate(container: View) {
BlankFragment().g215.smoothScrollToPosition(0)


}
override fun startUpdate(container: ViewGroup) {



super.startUpdate(container)
}




}