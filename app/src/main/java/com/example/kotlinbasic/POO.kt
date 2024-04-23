package com.example.kotlinbasic

fun main(){
    newTopic("POO")

    subTopic("Class")
    println(School()) //LOS PARENTESIS DESPUES DE School() ES PARA ABRIR UNA INSTANCIA, COMO DARLE VIDA A LA ESTRUCTURA


    //CONSTRUCTOR
    //ACA LE ASIGNAMOS LOS VALORES POR VARIABLE PERO EN LA clase School PODEMOS ASIGNARLAS EN EL constructor
    subTopic("Constructor")
    val school = School("Nacho", "Calle Don Bosco pep 255") //SI USO "" SE ASIGNAN SOLO LAS PARTES DE OBJ
    println(school)

    //OVERRIDE
    //SIGNIFICA QUE SE SOBRE ESCRIBE ALGO QUE YA ESTABA EN LA CLASE
    subTopic("Override")
    val schoolInactive = School("Nacho", "Calle Don Bosco 255", false)
    println(schoolInactive)

    //THIS
    //QUE PASA SI QUEREMOS DECIR QUE EL PARAMETRO NUEVO DEL contructor ES IGUAL AL NOMBRE DE var MutableList??
    //CUANDO INICIALIZAMOS EL NUEVO OBJ PUEDA ASIGNARSE EL VALOR DENTRO DE LA PROPIEDAD
    subTopic("this")
    val highSchool = School("Pepito", "Sanlo 233" ,
        mutableListOf(Person("Jose", "Linares")))
    println(highSchool)
}