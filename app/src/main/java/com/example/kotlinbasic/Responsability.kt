package com.example.kotlinbasic

class Responsability(name: String, responsability: String, val homeWork: String, age: Short) : Adulto(name,responsability,age)
{
    override fun respons1(): String { //trabajar
        return "Hola ${super.respons1()} mi nombre es $name y en casa debo $homeWork"
    }

}