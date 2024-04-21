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

    // IF ELSE
    subTopic(subtopic = "If else")
    val a = 500
    val b = 500
    if (a > b){
        println("a es mayor b")
    }else {
        println("a es diferente b")
    }

    if (a < b){
        println("a es menor a b")
    }else if (a == b){
        println("a es igual a b")
    }else {
        println("a es mayor a b")
    }

    // WHEN
    subTopic(subtopic = "When")
    val name = "Chimuelo"
    if (name.equals("Chimuelo")){
        println("Hola Chimuelo")
    }else if (name.equals("Rocio")){
        println("Hola bb")
    }else if (name.equals("Oliver") || name.equals("Curso de Kotlin")){
        println("Hola Oliver")
    }else if (name.equals("Lalito")){
        println("Hola Lalito")
    }else {
        println("Hola Desconocido")
    }   //Manera poco practica


    //LA SENTENCIA WHEN SE EJECUTA HASTA MIENTRAS SEA TRUE
    when(name){
        "Chimuelo" -> println("Hola Chimuelo")
        "Rocio" -> println("Hola bb")
        "Oliver",
            "Curso de Kotlin" -> println("Hola Oliver")
        "Lalito" -> println("Hola Lalito")
        else -> println("Hola Desconocido:)")
    }

    //ESTRUCTURA DE DATOS
    newTopic(topic = "Collections")
    //vararg admitir la declaración de una determinada función que pueda incluir una cantidad variable de argumentos
    subTopic("Vararg")
    multiArgument("Chimuelo", "Rocio", "Lalito", "Olver") //ESTO ES UNA COLECCION DE DATOS TIPO STR

    //ARRAY coleccion de datos del mismo tipo
    val array = arrayOf('a', 'b', 'c', 'd', 'e')
    println(array[0])
    println(array.get(1))
    print(array[4])
    val arrayStr: String = "pichichu"
    println(arrayStr[4])

    //LISTAS SOLO LECTURA
    subTopic("LISTOFF")
    val readOnlyList = listOf<String>("Soto", "Chimuelo", "Rocio", "Oliver", "Lalito")
    println("Read-Only $readOnlyList")
    println("Name at 1 = ${readOnlyList.get(1)}")

    //LISTAS MUTABLES
    subTopic("mutableListOf")
    val mutableList = mutableListOf("Soto", "Chimuelo", "Rocio", "Oliver", "Lalito")
    println("Mutable: $mutableList")

    mutableList.add("Mama ")//DE ESTA MANERA AGREGAMOS ELEMENTOS A LA LISTA
    println("Add: $mutableList")

    mutableList.removeAt(2) //DE ESTA MANERA ELIMINAMOS ELEMENTOS POR SU INDICIE 0, 1, 2
    println("RemuveAt: $mutableList")

    mutableList.remove("Soto") //DE ESTA MANERA ELIMINAMOS ELEMENTOS POR SU OBJETO O ELEMENTO STR
    println("RemuveSTR: $mutableList")

    mutableList.set(1, "Barti") // ACTUALIZAR ELEMENTO EXISTENTE, .set PIDE EL INDICE Y LUEGO EL OBJETO QUE VA A REEMPLAZAR
    println("Set: $mutableList")

    //MAP
    subTopic("mutableMap")
    val mutableMap = mutableMapOf<String, String>() //ESTO NECESITA CALVE Y VALOR POR ESO LLEVA <String, String>
    mutableMap.put("Chimu", "Chimuelo") //.put("") PIDE CLAVE Y VALOR PRIMERO VA LA CLAVE LUEGO EL VALOR/OBJ
    mutableMap.put("Pa", "Lalito")
    mutableMap.put("Ro", "Rocio")
    println("Map $mutableMap")
    println("Get by key ${mutableMap.get("Chimu")}") // ASI ES COMO SE ACCEDE AL OBJ USANDO SU KEY ASIGNADA EN .put
    mutableMap.remove("Pa") //ELIMINA EL ELEMENTO SEGUN SU KEY
    mutableMap.set("L", "ParaLalo") //ACTUALIZA/REEMPLAZA EL ELEMNTO
    println("remuve and set: $mutableMap")

    //ARRAYS OF NULL
    subTopic("Arrays of null")
    val nullArray = arrayOfNulls<String>(3) //ESPACIOS RESERVADOS EN MEMORIA NECESITA EL TIPO DE DATO Y LA LONGITUD <String>(3)
    nullArray[1] = "Chimuelo" //ASIGNACION DE DATO POR POSICION SEGUIDO DEL DATO
    println(nullArray[1])
    println(nullArray[0])

    //METHODS EN COLECCIONES
    subTopic("METODOS EN COLECCIONES")
    println(readOnlyList)
    println("SORT: ${readOnlyList.sorted()}")  //EL METODO .sorted SE USA PARA ORDENAR ALFABETICAMENTE
    println("reverse: ${readOnlyList.reversed()}") //EL METODO .reverse ORDENA LA LISTA DE ATRAS PARA ADELANTE
    println("indexOf ${readOnlyList.indexOf("Lalito")}") //ESTE METODO MAS OCUPADO, AYUDA A UBICAR UN ELEMENTO DE ACUERDO A SU VALOR E IMPRIME LA POSICION DONDE ESTA UBICADO
}
fun  multiArgument(vararg name: String){ //LOS NOMBRES DE LA COLECCION SE ALMACENAN EN name DE ESTA FUN
    println("valarg en la posisicon 0: ${name[0]}") //DE ESTA FORMA SE ACCEDE A LA COLECCION ${name[0]}
}