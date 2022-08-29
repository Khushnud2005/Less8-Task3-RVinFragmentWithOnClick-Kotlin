package uz.exemple.task3_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import uz.exemple.task3_kotlin.R
import uz.exemple.task3_kotlin.model.ContactsModel

class ContactFragment:Fragment() {
    lateinit var textView: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.contact_fragment, container, false)
        val contacts: String = requireArguments().getString("contact")!!
        initViews(view, contacts)
        return view
    }

    fun initViews(view: View, contacts: String) {
        textView = view.findViewById(R.id.tv_second_frag)

        textView.setText(contacts)
    }

}