package com.example.requestprofessorproject.ViewModel

import android.widget.CheckBox
import android.widget.EditText
import androidx.lifecycle.ViewModel
import com.example.requestprofessorproject.model.Bussiness.RegisterBussiness

class RegisterViewModel: ViewModel() {
    val regBussiness = RegisterBussiness()

    fun validaRegistrovm(nome: EditText?, email : EditText?, senha : EditText?, confsenha: EditText?): Boolean{

       return regBussiness.validaRegistro(nome,email,senha,confsenha)
    }


}