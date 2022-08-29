package uz.exemple.task3_kotlin.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.task3_kotlin.R
import uz.exemple.task3_kotlin.fragments.ContactFragment
import uz.exemple.task3_kotlin.model.ContactsModel

class ContactListAdapter(var arrayList: ArrayList<ContactsModel>):RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.setText(arrayList[position].name)

        val text = "Name: ${arrayList[position].name}\nLastName: ${arrayList[position].lastName}\nPhone: ${arrayList[position].phone}"

        holder.linearLayout.setOnClickListener { v ->
            val bundle = Bundle()
            bundle.putString("contact", text)
            val activity = v.context as AppCompatActivity
            val contactFragment = ContactFragment()
            contactFragment.setArguments(bundle)
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.secondFrame, contactFragment)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var textView: TextView
        lateinit var linearLayout: LinearLayout
        init {
            linearLayout = itemView.findViewById(R.id.linear_layout)
            textView = itemView.findViewById(R.id.itemTv)
        }
    }
}