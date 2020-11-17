package com.example.requestprofessorproject.View.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.requestprofessorproject.R
import com.example.requestprofessorproject.View.Adapater.MainMenuAdapter
import com.example.requestprofessorproject.View.Fragment.ShowInformationFragment
import com.example.requestprofessorproject.ViewModel.MainMenuViewModel
import com.example.requestprofessorproject.model.Bussiness.User
import kotlinx.android.synthetic.main.mode_tela_mainmenu.*
import kotlinx.android.synthetic.main.mode_tela_mainmenu.view.*

class MainMenuActivity : AppCompatActivity() {
   var fm = supportFragmentManager

    private lateinit var viewModel: MainMenuViewModel

    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.rvcontainer)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        viewModel = ViewModelProvider(this).get(MainMenuViewModel::class.java)

        viewModel.getUsers()
        setupObservables()



    }


    private fun setupObservables() {
        viewModel.usersLiveData.observe(this, {
            it?.let { users ->
                recyclerView.apply {

                    layoutManager = LinearLayoutManager(this@MainMenuActivity)
                    adapter = MainMenuAdapter(users) { position ->

                        findViewById<ImageView>(R.id.ivMainItemAvatar).setOnClickListener{
                            val bundle = Bundle()
                            bundle.putParcelable("passa",users[position])
                            val info = ShowInformationFragment()
                            info.arguments = bundle

//                            fm.beginTransaction().add(R.id.fragmentContainer,info).commit()
//                            fm.beginTransaction().replace(R.id.fragmentContainer,info).commit()

                            Toast.makeText(context,"Jesus", Toast.LENGTH_LONG).show()



                        }


                    }

                }
            }

        })


    }


}











