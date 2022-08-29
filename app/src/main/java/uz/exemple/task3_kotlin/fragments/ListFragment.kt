package uz.exemple.task3_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.task3_kotlin.R
import uz.exemple.task3_kotlin.adapters.ContactListAdapter
import uz.exemple.task3_kotlin.model.ContactsModel

class ListFragment:Fragment() {

    lateinit var recyclerView: RecyclerView
    //lateinit var context: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.list_fragment, container, false)
        initViews(view)
        return view
    }

    fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        val arrayList: ArrayList<ContactsModel> = ArrayList<ContactsModel>()
        for (i in 1..20) {
            arrayList.add(ContactsModel("User $i", "Userov $i", "${i}234567${i}"))
        }
        recyclerView.setLayoutManager(LinearLayoutManager(context))
        recyclerView.setAdapter(ContactListAdapter(arrayList))
    }
}