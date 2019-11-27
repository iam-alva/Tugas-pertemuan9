package bersatu.kita.myfragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.fragment.CommunicationViewModel
import com.example.fragment.R
import com.google.android.material.textfield.TextInputEditText


class FirstFrament : Fragment() {
    //deklarasi dari CommunicationViewmodel
    private var communicationViewModel: CommunicationViewModel? = null
    private var communicationViewModel1: CommunicationViewModel? = null


    //fungsi yang pertama kali akan di jalankan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
        communicationViewModel1 = ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    //digunakan untuk membuat View yang pertama kali akan di buka
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    //digunakan untuk mengisi nilai pada View fragment_first
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        nameEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }
                override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                    communicationViewModel!!.setName(charSequence.toString())
                }
                override fun afterTextChanged(editable: Editable) {
                }
            }
        )

        val nameEditKet = view.findViewById<TextInputEditText>(R.id.textInputTextKet)
        nameEditKet.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }
                override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                    communicationViewModel1!!.setKet(charSequence.toString())
                }
                override fun afterTextChanged(editable: Editable) {
                }
            }
        )
    }

    //menjalankan Objek
    companion object {
        fun newInstance(): FirstFrament {
            return FirstFrament()
        }
    }
}