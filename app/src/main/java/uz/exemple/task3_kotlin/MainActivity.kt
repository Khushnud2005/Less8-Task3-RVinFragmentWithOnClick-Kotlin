package uz.exemple.task3_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.exemple.task3_kotlin.fragments.ListFragment

class MainActivity : AppCompatActivity() {
    lateinit var listFragment: ListFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        listFragment = ListFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.firstFrame, listFragment)
            .commit()
    }
}