package com.example.kotlinbasic

import java.util.EnumSet

fun main(){
    newTopic("Metodo de String")
    //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34
    //K o t l i n  c o u r e s e  b y  C u r s o s  A n d r o i d  A N T
    val i = Int
    val course = "Kotlin courese by Curso Android ANT"
    val target = "Android"
    println(course.length)
    println(course.compareTo(target)) //compareTo SE USA PARA COMPARAR EL ORDEN ALFABETICO EN ESTE CASO target CON course "course.compareTo(target)"
    println(course.equals(target))//COMPARA SI LOS STRINGS SON IGUALES Y ES KEYSENSITIVE
    println(course.contains(target))//VERIFICA SI CONTIENE EL MISMO STRING (si course en su variable contiene el texto de la variable target)
    println(course.toLowerCase())//ESTO PONE TODO EL TEXTO EN MINUSCULA
    println(course.toUpperCase()) //ESTO LO PONE EN MAYUSCULA
    println(course.subSequence(0, 6)) //ESTE METODO SOLICITA UN RANGO EL CUAL IMPRIME DESDE EL NUMERO INDICADO DEL STRING
    println(course.indexOf("s")) //IMPRIME LA PRIMER POSICION QUE COINCIDA CON LA LETRA INGRESADA MAYUSCULA O MINUSCULA
    val empty = " "
    println(empty.isBlank())//ESTE METODO isBlank VERIFICA SI ESTA EN BLANCO O " "
    println(empty.isEmpty())//VERIFICA QUE LA LONGITUD NO SEA 0
    println(course.lastIndexOf("n")) //PODEMOS IMPRIMIR EL INDICE DE ATRAS PARA ADELANTE COMO indexOf PERO AL REVEZ
    println(course.toLowerCase().lastIndexOf("n"))//DE ESTA FORMA BUSCA EL index SIN IMPORTAR MAYUSCULA O MINUSCULA
    println(course.replace("c", "K")) //REEMPLAZA EL STRING POR OTRO
    println(course.toLowerCase().replace("an", "os")) //
    println(course.replaceBefore("by", "only "))//REEMPLAZA TODO LO QUE ESTE ANTES DE EL PRIMER PARAMETRO QUE LE DAMOS POR EL SEGUNDO
    println(course.reversed())//PONE AL REVEZ LA CADENA DE TEXTO
    println(course.slice(20..course.length-1))//EXTRAE UNA PARTE DEL STRING EN BASE A UN RANGO
    println(course.split(" ")) //ESTE METODO DEVIDE EL TEXTO EN UN ARREGLO [Kotlin, courese, by, Curso, Android, ANT]
    println(course.startsWith('K'))//DEVUELVE UN BOOLEANO SEGUN EL CARACTER QUE LE PASES
    println(course.substring(14,16))//ITERA SOBRE LAS POSICIONES DE INICIO Y FIN Y MUESTRA SOLO ESO
    println(course.substring(course.lastIndexOf("A", course.length)))//INDICA DE QUE LETRA HASTRA EL FINAL DE LA CADENA VA A MOSTRAR
    println(course.trim())//QUITA LOS ESPACIOS AL INICIO Y AL FINAL DE LA CADENA

}