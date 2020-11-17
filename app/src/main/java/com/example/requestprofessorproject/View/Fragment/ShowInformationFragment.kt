package com.example.requestprofessorproject.View.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.bumptech.glide.Glide
import com.example.requestprofessorproject.R
import com.example.requestprofessorproject.View.Activity.MainMenuActivity
import com.example.requestprofessorproject.model.Bussiness.User
import kotlinx.android.synthetic.main.fragment_show_information.*


class ShowInformationFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_information, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val showinfo = arguments?.getParcelable<User>("passa")
        Glide.with(view.context).load(showinfo?.imgAvatarUser).into(ivMainItemAvatarFinal)
        view.findViewById<TextView>(R.id.whatsupnick).text = showinfo?.whapp
        view.findViewById<TextView>(R.id.instagramNick).text = showinfo?.instagram
        view.findViewById<TextView>(R.id.localidade).text = showinfo?.locate


        view.findViewById<ImageView>(R.id.closebtn).setOnClickListener {
            Toast.makeText(view.context,"Goal",Toast.LENGTH_LONG).show()
           val i = Intent(it.context,MainMenuActivity::class.java)
            startActivity(i)
        }

    }




    companion object {


    }
}