package uz.exemple.task3_kotlin.model

import java.io.Serializable

data class ContactsModel( var name: String, var lastName: String, val phone: String):Serializable
