package com.example.kotlinbasic

//EL OBJETO persona TIENE LAS PROPIEDADES "firstName" "lasName" "tax: Float" "salary: Float"
//Y PUEDE HACER LO QUE DICE EN "fun"
class Person(val firstName:String, val lastName: String) {
    //AGREGARMOS PROPIEDAD = SE INICIALIZA "10.0f"
    var tax: Float  = 10.0f

    var salary: Float = 0f

    //DECLARACION DEL METODO
    fun getFullName(): String = "$firstName $lastName"
    fun showWoerk(): String{
        return "Capturando Datos..."
    }
}