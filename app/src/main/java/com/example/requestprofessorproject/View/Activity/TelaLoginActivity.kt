package com.example.requestprofessorproject.View.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.requestprofessorproject.R
import com.example.requestprofessorproject.ViewModel.TelaLoginViewModel


class TelaLoginActivity : AppCompatActivity() {
    private lateinit var viewModel: TelaLoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)
        val email = findViewById<EditText>(R.id.teEmailLogin)
        val senha = findViewById<EditText>(R.id.teSenhaLogin)
        viewModel = ViewModelProvider(this).get(TelaLoginViewModel::class.java)






        findViewById<AppCompatButton>(R.id.btRegister).setOnClickListener(openActivity(RegisterActivity::class.java))
        findViewById<AppCompatButton>(R.id.btLogin).setOnClickListener{
            var isOkay = viewModel.validaLogin(email,senha)
            if (isOkay){
                val i = Intent(this,MainMenuActivity::class.java)
                startActivity(i)
                finish()
            }else{
                viewModel.validaLogin(email,senha)
            }
        }

        }

    private fun openActivity(activity: Class<out Activity?>): View.OnClickListener? {
        return View.OnClickListener {
            startActivity(Intent(this,activity))
        }
    }

}