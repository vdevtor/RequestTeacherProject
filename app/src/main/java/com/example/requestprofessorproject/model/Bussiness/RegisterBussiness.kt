package com.example.requestprofessorproject.model.Bussiness

import android.widget.CheckBox
import android.widget.EditText

class RegisterBussiness {



    fun validaRegistro(nome: EditText?, email : EditText?, senha : EditText?, confsenha: EditText?): Boolean {
        var nome = nome
        var email = email
        var senha = senha
        var confsenha = confsenha

        var isokay = true

        if (nome?.text.toString().isBlank()) {
            nome?.error = "Preencha campo Nome"
            isokay = false
        } else {
            nome?.setError(null)
        }
        if (email?.text.toString().isBlank()) {
            email?.error = "Preencha campo Email"
            isokay = false

        } else {
            email?.setError(null)
        }
        if (senha?.text.toString().isBlank()) {
            senha?.error = "Preencha campo Senha"
            isokay = false
        } else {
            senha?.setError(null)
        }
        if (confsenha?.text.toString().isBlank()) {
            confsenha?.error = "Preencha campo Confirma Senha"
            isokay = false
        } else {
            confsenha?.setError(null)

        }


        return isokay
    }
}