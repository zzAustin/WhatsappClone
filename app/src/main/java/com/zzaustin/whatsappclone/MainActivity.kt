package com.zzaustin.whatsappclone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // make a change
    }

    class PlaceHolderFragment: Fragment(){
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val rootView = inflater.inflate(R.layout.fragment_main, container, false);
            rootView.section_label.text = "Hello world from section ${arguments?.getInt(ARG_SECTION_NUMBER)}"
            return rootView
        }

        companion object{
            private val ARG_SECTION_NUMBER = "Section number"

            fun newIntent(sectionNumber: Int): PlaceHolderFragment{
                val fragment = PlaceHolderFragment()
                val args = Bundle()
                args.putInt(ARG_SECTION_NUMBER, sectionNumber)
                fragment.arguments = args
                return fragment
            }
        }
    }
}
