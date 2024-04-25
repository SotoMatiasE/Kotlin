package com.example.kotlinbasic

import java.util.EnumSet

private var nullStrGlobal: String? = null
private lateinit var lateinitGlobal:  String
private val lazyGlobal: Any by lazy { /*aca se inicializa*/ "gLazyKotlin"  }
//lateinit SOLO FUNCIONA CON var PORQUE NECESITA CAMBIAR EL VALOR DE LA VARIABLE Y lazy FUNCIONA CON val PORQUE SOLO ES LECTURA


fun main(){
    newTopic("Metodo de String")
    //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34
    //K o t l i n  c o u r e s e  b y  C u r s o s  A n d r o i d  A N T
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

    //NULABLE ? !!
    newTopic("Null safety")
    subTopic("? PARA PODER DECLARAR UNA VARIABLE QUE INICIA COMO null O QUE PUEDA CONTENER null SE UTILIZA ?")
    var nullStr: String? = null //PARA PODER DECLARAR UNA VARIABLE QUE INICIA COMO null O QUE PUEDA CONTENER null SE UTILIZA ?
    nullStr = "Kotlin"
    println(nullStr?.get(0)) //ANTES DE LLAMAR AL METODO get DEBEMOS VERIFICAR QUE NO ES null ANTES DE LLAMAR AL METODO PARA ESO USAMOS ? EN LA VARIABLE
    println(nullStrGlobal?.reversed())

    subTopic("!! ESTE DOBLE SIGNO ASEGURA QUE NO SEA NULO")
    nullStr = null
    showmessage(nullStr)
    nullStrGlobal = null
    showmessage("Kotlin")

    //EVITAR NULOS
    subTopic("elvis operator ESTA DEFINIDO POR ?:, PARA VALIDAR UN VALOR Y ASIGNAR UNO POR DEFAULT ?: ESTOS SIMBOLOS EVALUAN SI ES NULO EN CASO DE SERLO LO COMPLETA CON EL DEFAULT")
    val elvis = nullStrGlobal ?: "Java"
    println("Yo programo en $elvis")

    val noElvis = if (nullStrGlobal != null) {
        nullStrGlobal
    }else{
        "Java"
    }
    println("Yo programo en $noElvis")

    //COMO PROCESAR DATOSEN TIEMPO REAL DE LA TERMINAL DE ANDROID
    //READLINE
    subTopic("Readline")
    println("Inserte un numero: ")
    val first = readLine() //readLine ESPERA UN VALOR,CAPTURA EL VALOR INGRESADO Y LO ALMACENA EN first EN FORMATO STRING
    val a = first!!.toInt() //first NO PUEDE SER NULO POR ESO SE AGREGA !! Y SE CONVIERTE EN ENTERO CON  toInt Y LO ALMACENA EN a
    println("a = $a")
    print("Inserte el segundo numero: ")
    val second = readLine() //
    val b = second!!.toInt() //b ALMACENA EL VALOR INGRESAD DE second
    println("b = $b")


    //OPERADORES MATEMATICOS
    newTopic("Operadores Matematicos")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    //SMART CAST
    newTopic("SAFE CSAT VA A ENGLOBAR TODO LO QUE QUIERA CONVERTIRSE DE UN TIPO DE DATO A OTRO")
    subTopic("Smart Cast")
    var obj: Any = "Kotlin course" //DE TIPO Any SIGNIFICA QUE PUEDE SER DE CALQUIER TICO QUE EXISTE
    //println(obj.toString().toInt() * b)
    val objNum: Any = 3
    if (objNum is Int) { //KOTLIN COMBIERTE DE MANERA TEMPORAL EL VALOR DE Any
        println(objNum.toString().toInt() * b) //ACA MULTIPLICAMOS EL VALOR DE obj POR EL INGRESO DE a y b
    }else {
        println("obj no es un numero")
    }

    //TRY CATCH FINALY
    subTopic("Try Catch Finaly: try ES EL INTENTO DE EJECUTAR Y catch SE ENCARGA DE ATRAPAR CUALQUIER ERROR QUE SE GENERE ENTRE EL try")
    obj = 3
    try {
        println(obj.toString().toInt() * b)
        println("Obj es un numero y esta es la ultima linea del try")
    } catch (e: Exception){
        println(e)
        println("Mensaje personalizado para el error en catch")
    }finally { //finaly siempre se ejecuta con o sin error
        println("Try catch finalizado...")
    }

    //UNSAFE CAST & SAFE CAST
    subTopic("Unsafe cast")
    obj = "true"
    val unsafeStr: String = obj as String
    println(unsafeStr)
    subTopic("Safe cast")
    obj = true
    val safeStr = obj as? String
    println(safeStr)

    //THROW de manera segura Ctrl + Alt + T
    subTopic("Throw")
    val job = "Designer"
    checkType(job) //ESTO ES UN METODO QUE RECIBE A job
    try {
        checkType(b)
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Tarea finalizada")
    }

    //INFIX(EXTENSION) crea una funcion que este como extencion de una clase, podemos tener una clase que le falta un metodo
    // y de forma temporal o local se puede crear
    subTopic("Infix Extension")
    val name = "Android"
    println(name.toUpperCase())
    println(name.toLowerCase())
    println(name.toMixCase(true))

    //Variables que pueden inicializars de forma tardia
    //LAZY AND LATEINIT
    newTopic("Asignacion tardia lateinit")
    subTopic("Lateinit SOLO SE APLICAN A VARIABLES GLOBALES, NOS PERMITE DECLARAR UNA VARIABLE QUE DE MOMENTO NO PUEDE CONTENER VALOR")
    if (setValueforLateinit()){
        println(lateinitGlobal)
        println(lateinitGlobal.toMixCase(true))
    }

    subTopic("Lazy")
    println(lazyGlobal)
    //lazyGlobal = "f"

    //SCOPE FUNCTIONS
    newTopic("Funciones de alcance")
    val highSchool = School("Pepito", "Sanlo 233" ,
        mutableListOf(Person("Jose", "Linares")))
    val teacher = Teacher("Leo" , "Quiroga", 45) //CREACION DEL MAESTRO
    val admin = Admin("Jose", "Lui", 1) //CREANDO ADMINISTRATIVO

    //WITH MANDA A LLAMAR OBJETOS!!!
    subTopic("With ESTO SE UTILIZA PARA MANADR A LLAMAR UN METODOS SIN RESTULTADO DIRECTO DEL OBJ")
    with(highSchool){  //Entre () se asigna el obj a trabajar. Con (obj) hacer bloque de codigo
        println("Este obj imprime todo esto:")
        println(getType()) //
        println(toString())
        println()
    }

    //APPLY Aplica las siguentes configuraciones
    subTopic("Apply, UTILIZA PARA MODIFICAR EL VALOR DE LAS PROPIEDADES DEL OBJ")
    teacher.apply {
        classroom.key = "4°B"
        salary = 2000f
    }
    println(teacher.classroom.key)
    println(teacher.salary)
    println("Vaores asignados correctamente con apply")

    //RUN PUEDO ASIGNAR PROPIEDADES Y AL MISMO TIEMPO MANDAR A LLAMAR METODOS
    subTopic("Run, SE RECOMPIENDA PARA EJECUTAR UN BLOQUE DE CODIGO MAS COMPLEJO RELACIONADO AL OBJ")
    highSchool.run { //imprime todo el obj
        println("Ejecuta el siguento bloque de codigo en el OBJ")
        staff.add(teacher) //asignacion
        staff.add(admin) //asignacion
        println("Members: ${staff.size}") //total del staff
        println(this)
    }

    //Let Permite ejecutar un bloque de codigo a un obj no null(verifica con ?)
    subTopic("Let, SE RECOMIENDA UTILIZAR PARA EJECUTAR UN BLOQUE DE CODIGO CUANDO UN OBJ NO ES NULO ?")
    var school: School? = null
    school = createSchool()
    school?.let { //SI LA ESCUELA ES DIFERENTE DE null "school?." HAS LO SIGUENTE ".let"
        school.staff.add(admin)
        println("si el obj es diferente de null, imprimilo: $it")
    }

    //Also. Ademas ejecuta el siguente codigo
    subTopic("Also, SE RECOMIENDA USAR PARA AÑADIR UNA COFIGURACION O PROCESO DONDE SE NECESITE LA REFERENCIA AL OBJ it")
    val udemy: School
    udemy = School().apply {
        numCode = "431".also { //obj it
            println("y tambien, notifica que el codigo de la escuela nueba es: $it")

        }
    }
}

//FUNCION PARA let
private fun createSchool(): School? = School("Nacho", "Calle Don Bosco pep 255")



    //FUNCION PARA LATEINIT
private fun setValueforLateinit(): Boolean {
    lateinitGlobal = "gLateinitKotlin"
        return lateinitGlobal.isNotEmpty()
}

private infix fun String.toMixCase(firstUpper: Boolean): String{
    var mixString = ""
    var index = 0           //Primero pone los valores en 0 o vacio
    var module = 0
    if(firstUpper){ //PREGUNTA SI EL PRIMERO ES MAYUSCULA O MINUSCULA...SI "firstUpper" es falso ES MINUSCULA Y EL MODULO ES 1 NUMEROS PARES EN while
        this.toUpperCase() //this SE REFIERE AL CONTEXTO ACTUAL EN ESTE CASO HACE REFERENCIA AL STRING name ES COMO PONER "println(name.toUpperCase())"
    }else{
        this.toLowerCase()
    }

    while(index < this.length){ //MIENTRAS index SEA MENOR A LA LONGITUD DE this
        if(index % 2 == module){
            mixString += this.get(index).toUpperCase() //+= ACUMULA DATOS
        }else {
            mixString += this.get(index).toLowerCase()
            module = 1
        }
        index++
    }

    return mixString
}

//FUNCION PARA THROW
private fun checkType(value: Any) {
    if (value is String){
        println("String valido")
    }else{
        throw TypeCastException("No es STR")
    }

}


//FUNCION PRIVADA
private fun showmessage(msg: String?){
    println("? ${msg?.get(0)}")

    //VALIDAMOS SI ES DIFERENTE DE null
    if (msg!= null){
        println("! ${msg.get(0)}")
    }
    //AHORA VALIDAMOS A nullStrGlobal QUE NO SEA NULO
    if (nullStrGlobal!= null){
        println("g!! ${nullStrGlobal!!.get(0)}" )
    }


}


























