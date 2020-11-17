package com.example.requestprofessorproject.View.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.requestprofessorproject.R
import com.example.requestprofessorproject.ViewModel.RegisterViewModel

class RegisterActivity : AppCompatActivity() {


    private lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)

        val nome = findViewById<EditText>(R.id.teNomeRegister)
        val email= findViewById<EditText>(R.id.teEmailRegister)
        val senha = findViewById<EditText>(R.id.teSenhaRegister)
        val confsenha = findViewById<EditText>(R.id.teSenhaConfirma)

            findViewById<AppCompatButton>(R.id.btRegisterTelaRegistra).setOnClickListener{

                val isokay = viewModel.validaRegistrovm(nome,email,senha,confsenha)
                if(isokay){
                    val i = Intent(this,MainMenuActivity::class.java)
                    startActivity(i)
                    finish()
                }
                    else{
                    viewModel.validaRegistrovm(nome, email, senha, confsenha)
                    }
            }
        }

    private fun openActivity(activity: Class<out Activity?>): View.OnClickListener? {

        return View.OnClickListener {
            startActivity(Intent(this,activity))

        }
    }






}