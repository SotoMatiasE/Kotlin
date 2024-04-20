package com.example.kotlinbasic


//CONDICIONALES
fun main(){
    newTopic("Sentencias Condiciones")
    subTopic("If")

    //CONDICION IF verificacion de valores boolean
    if (true) {
        println("Condicion True")
    }

    //EQUALITY
    subTopic(subtopic = "EQUALITY")
    if (1==1) {
        println("1 es igual a 1")
    }

    //EQUALS
    subTopic(subtopic = "EQUALS")
    val so = "Soto"
    if (so.equals("Soto")) {    //LA ETIQUETA .equals HACE REFERENCIA A SI LA VARIABLE DECLARADA ES IGUAL AL STR DEL PARENTESIS
        println("es igual a Soto")
    }

    //OPERADORES LOGICOS

    subTopic(subtopic = "Logical Operators")
    if (1!=2) { //not distinto de
        println("1 no es igual a 2")
    }

    if (1==2 || 1 < 2) {// los (|| "or")  ("<" menor) (">" mayor)
        println("1 es igual o menor a 2")
    }

    if (1 != 2 && 1 < 2) {// si (1 != 2) es TRUE "&&" y 1 < 2) es TRUE se imprime
        println("1 es diferente y menor que 2")
    } else {
        println("un valor es igual a 1")
    }

    //NESTED IF... IF ANIDADO
    if (1 == 1){
        if (1 < 2){
            println("if anidado")
        }
    }
}