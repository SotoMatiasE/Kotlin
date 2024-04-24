package com.example.kotlinbasic

//CLASE PADRE
open class Adulto(val name:String, var resposability: String, private var age: Short) {
    val paseoPerro: String = "7:15 am saco a mi perro al baño"

    var goWork: String  = "7:30 voy a mi trabajo"
    fun getAdulto(): String = "$name $resposability"

    open fun respons1(): String { //trabajar
        return "A las 7am me despierto"
    }

}