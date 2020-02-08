package com.example.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank_fragment2.view.*
import kotlinx.android.synthetic.main.fragment_blank_fragment3.view.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


       var view= inflater.inflate(R.layout.fragment_blank_fragment3, container, false)

        var a1 = mutableListOf<item2>()

        a1.add(item2("150 le","2wCEAAkGBw8PDw8QDxAVFRUPDxUPFQ8VEBUVFRUVFRUWFhUVFRUYHSggGBolGxYVITEhJSkrLjAuFx8zODMsNygtLisBCgoKDg0NFQ0NFSseFR0tNzcuLjctKy0rNys3LS8vNy83LS0rKysrNys4Li0tNzIrKysrODQrLysrLSsrNyswK"))
        a1.add(item2("150 le","2wCEAAkGBw8PDw8QDxAVFRUPDxUPFQ8VEBUVFRUVFRUWFhUVFRUYHSggGBolGxYVITEhJSkrLjAuFx8zODMsNygtLisBCgoKDg0NFQ0NFSseFR0tNzcuLjctKy0rNys3LS8vNy83LS0rKysrNys4Li0tNzIrKysrODQrLysrLSsrNyswK"))

        a1.add(item2("150 le","2wCEAAkGBw8PDw8QDxAVFRUPDxUPFQ8VEBUVFRUVFRUWFhUVFRUYHSggGBolGxYVITEhJSkrLjAuFx8zODMsNygtLisBCgoKDg0NFQ0NFSseFR0tNzcuLjctKy0rNys3LS8vNy83LS0rKysrNys4Li0tNzIrKysrODQrLysrLSsrNyswK"))


        var adabter=itemlist2(activity!!.applicationContext,R.layout.exm2,a1)
        view.blankgrid3.adapter=adabter



        return view


    }


}
