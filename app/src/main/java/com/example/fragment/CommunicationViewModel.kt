package com.example.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String> ()
    private val mKet = MutableLiveData<String> ()

    val name: LiveData<String>
    get() = mName

    val ket: LiveData<String>
        get() = mKet

    fun setName(name: String) {
        mName.value = name
    }

    fun setKet(ket: String) {
        mKet.value = ket
    }
}