package com.example.kotlinbasic
//VAMOS A HABILITAR LA HERENCIA
//EN LA HERENCIA VA A LLEVAR LAS VARIABLES DE LA CLASE PADRE SIN var o val
//LUEGO FUERA DE PARENTESIS : Y LA CLASE PADRE ()
class Teacher(firstName:String, lastName: String, var students: Short) : Person(firstName, lastName){

}