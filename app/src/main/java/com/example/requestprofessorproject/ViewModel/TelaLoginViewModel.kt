package com.example.requestprofessorproject.ViewModel

import android.widget.EditText
import androidx.lifecycle.ViewModel
import com.example.requestprofessorproject.model.Bussiness.TelaLoginBussiness

class TelaLoginViewModel : ViewModel(){
    val telaLoginBussiness = TelaLoginBussiness()

    fun validaLogin(email : EditText?, senha: EditText?): Boolean{
        return telaLoginBussiness.validaRegistro(email,senha)
    }
}