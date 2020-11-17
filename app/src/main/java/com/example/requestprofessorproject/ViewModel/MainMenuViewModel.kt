package com.example.requestprofessorproject.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.requestprofessorproject.model.Bussiness.MainMenuBussiness
import com.example.requestprofessorproject.model.Bussiness.User

class MainMenuViewModel: ViewModel() {
    val usersLiveData: MutableLiveData<List<User>> = MutableLiveData()
    val mainMenuBussiness = MainMenuBussiness()


    fun getUsers(){
        val users = mainMenuBussiness.getUser()
        usersLiveData.postValue(users)
    }
}