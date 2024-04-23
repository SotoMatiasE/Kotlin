package com.example.kotlinbasic

//EL OBJETO persona TIENE LAS PROPIEDADES "firstName" "lasName" "tax: Float" "salary: Float"
//Y PUEDE HACER LO QUE DICE EN "fun"
//open HABILITA LA HERENCIA DE ESTE OBJ
open class Person(val firstName:String, val lastName: String) {
    //AGREGARMOS PROPIEDAD = SE INICIALIZA "10.0f"
    var tax: Float  = 10.0f
    get() = 1 -(field*0.01f) //field HACE REFERENCIA A LA MISMA VARIABLE

    var salary: Float = 0f
        set(value) { //EL VALOR DE 10000 LLEGA A "value" Y SE ASIGNA A field = salario compoleto
            field = value
        }
        get() = field * tax //ESTE RESULTADO SE DEVUELVE CON EL PRIMER get de tax MLTIPLICADO POR EL PRIMER METODO "var tax"

    //DECLARACION DEL METODO
    fun getFullName(): String = "$firstName $lastName"
    open fun showWork(): String{
        return "Capturando Datos..."
    }
}