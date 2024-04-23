package com.example.kotlinbasic

//fun hace referencia a una function

//VARIABLE GLOBAL
var username = "pepito"

//CONSTANTE GLOBAL. UNA CONSSTANTE NO PUEDE CAMBIAR DE VALOR POR ESO SE USA const val
const val SPECIES = "Human" // YA SABEMOS EL VALOR Y USA EL ESPACIO REQUERIDO
private const val SEPARATOR = "===================="
fun main (){
    println("Basico de kotlin")
    println() //print solo genera un salto de linea

    //VARIABLE LOCALES
    newTopic(topic = "Variables")
    var age = 27 //CON var SE PUEDE CAMBIAR/EDITAR/SOBRE ESCRIBIR EJ: var age = 22
    println(age)

    val name = "soto" //USANDO val EL VALOR DE LA VARIABLE NO SE PUEDE CAMBIAR O REASIGNAR UN VALOR♠♠
    println(name)

    var job: String  //USANDO var job: PODEMOS DARLE EL TIPO DE DATO PARA ASIGNARLE DESPUES EL VALOR
        job = "DEVKOTLIN"
    println(job)

    val language: String /*** val PODEMOS ASIGNARLE EL VALOR DESPUES DE QUE SE DECLARO CON EL TIPO DE DATO
                                LO QUE HACE ES RESERVAR EL ESPACIO ***/
    language = "Kotlin"
    println(language)

    print(username)

    //PODES USAR val PARA SOLO LECTURA PERO NO SABEMOS EL VALOR EXACTO
    //PARA USA var EN CASO DE SABER SI EL VALOR ES REASIGNABLE MAS ADELANTE


    //CONSTANTE
    newTopic(topic = "CONSTANTES")
    println(SPECIES)

    //STRING TEMPLATE O DINAMICOS
    //PARA USAR LA VARIABLE DENTRO DE UN STRING UTILIZA $ MAS NOMBRE DE LA VARIABLE O CONSTANTE
    newTopic(topic = "STRING TEMPLATE")
    println("My name is $name")
    println("My name is $username")
    println("I am $SPECIES")

    //TIPOS DE DATOS
    newTopic(topic = "TIPOS DE DATOS")
    val char1: Char = 'c'
    val str: String = "chimu"
    val boolean: Boolean = true or false
    val jobs: Byte = 3 //almacena tipo numerico chico menor a 100
    val workDay: Short = 200
    val milliseconds: Long = 5465478528 //ALMACENA NUMEROS MAYOR A 10 CERO
    val height: Float = 12.4f //SI LO QUERMOS COMO FLOAT SE AGREGA F
    print("Altura: ${height}m")  //SI QUIERO AGREGAR UN STRING DESPUES DE LA VARIABLE SE ENCIERRA EN {}

    //LLAMANDO FUNCION DE AFUERA
    newTopic(topic = "FUNCIONES")
    basic()
    arguments(name)
    println(returnData()) //CON ALT + ENTER CREA LA FUNCION O PROPONE SOLUCIONES

    //SOBRE CARGA DE FUNCIONES, si quiero imprimir dato con la misma funcion pero con diferente dato
    //Es basicamente tener otra funcion con el mismo nombre pero otros paramentros
    overload(age)
    overload(job)
    overload(job, language)
    allBasic(language)
}

const val pw = "por fin kotlin tiene oportunidad"
fun allBasic(language: String) {
    val learn: String = "Soto esta aprendiendo"
    println("Macu $pw ahora ${learn} $language")
}

fun overload(job: String, language: String){
    println("Mi trabajo es: $job con $language and my specied is $SPECIES" )
}


fun overload(job: String) {
    println("Mi work is $job")
}

fun overload(age: Int) {
    println("My age is: $age")
}

fun returnData(): String {
    return "Datos retornados"
}

fun arguments(name: String) {
    println("hi $name")
}

fun basic(){
    println("hi")
}

fun newTopic(topic: String){
    print("\n$SEPARATOR $topic $SEPARATOR\n")
}

fun subTopic(subtopic: String){
    print("\n$SEPARATOR $subtopic\n")
}


