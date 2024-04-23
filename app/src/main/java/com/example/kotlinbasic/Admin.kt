package com.example.kotlinbasic

class Admin(firstName:String, lastName: String, val officeNumber: Short) : Person(firstName, lastName) {
    override fun showWork(): String {
        return "Agendando..."
    }
}