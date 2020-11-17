package com.example.requestprofessorproject.model.Bussiness

import android.widget.EditText

class TelaLoginBussiness {




    fun validaRegistro(email: EditText?, senha : EditText?): Boolean {
        var email = email
        var senha = senha


        var isokay = true

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
        return isokay
    }
    }
