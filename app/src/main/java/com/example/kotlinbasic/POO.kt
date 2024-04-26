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
    val schoolInactive = School("Nacho", "Calle Don Bosco 255", School.INACTIVE)
    println(schoolInactive)

    //THIS
    //QUE PASA SI QUEREMOS DECIR QUE EL PARAMETRO NUEVO DEL contructor ES IGUAL AL NOMBRE DE var MutableList??
    //CUANDO INICIALIZAMOS EL NUEVO OBJ PUEDA ASIGNARSE EL VALOR DENTRO DE LA PROPIEDAD
    subTopic("this")
    val highSchool = School("Pepito", "Sanlo 233" ,
        mutableListOf(Person("Jose", "Linares")))
    println(highSchool)

    //PORPERIES AND METHODS
    subTopic("Metodos y Propiedades")
    val person = Person("Jose", "Linares")
    println(person.getFullName())
    println(person.showWork())
    person.salary = 1000f
    println(person.salary)

    //GET & SET
    //ESTOS METODOS NOS AYUDAN A PROCESAR LOS DATOS ANTES O DESPUES DE ASIGNAR UN VALOR
    subTopic("Get & Set")
    person.tax = 20f
    println(person.salary)

    //HERENCIA
    //PERMITE QUE UNA CLASE HEREDE DE OTRA Y ADQUIERA PROPIEDADES Y METODOS Y ANEXAR O MODIFICAR GRACIAS A OVERRIDE
    subTopic("Herencia")
    val teacher = Teacher("Leo" , "Quiroga", 45) //CREACION DEL MAESTRO
    highSchool.staff.add(teacher)
    val admin = Admin("Jose", "Lui", 1) //CREANDO ADMINISTRATIVO
    highSchool.staff.add(admin)
    println(highSchool)

    //SUPER
    subTopic("SUPER")
    println("Admin: ${admin.showWork()}")
    println("Teacher: ${teacher.showWork()}")

    //ENCAPSULAMIENTO-VISIBILIDAD
    //PODER MODIFICAR LA VISIBILIDAD DENTRO DE LA CLASE SEA PROPIEDADES O METODOS
    //CON EL FIN DE QUE EL RESTO DE LAS CLASES DEL PROYECTO VEAN LO QUE SE REQUIRE
    //SI QUIERO HACER UN METODO PRIVADO O PUBLICO DEBO IR AL OBJETO PADRE
    subTopic("Encapsulamiento-Visibilidad")
    println(teacher.firstName)
    //println(teacher.lastName)

    //COMPANION OBJ
    //ES UNA FORMA QUE KOTLIN TRATA CON LAS PROPIEDADES ESTATICAS QUE PUEDEN ESTAR DISPONIBLES PARA EL RESTO DEL CODIGO
    subTopic("Companion Objet")
    println(School.ACTIVE)
    val schoolActive = School("sex", "avenida", School.ACTIVE)
    println(schoolActive)

    //ENUMS Tipo de archivo PARA AQUELLOS DATOS QUE NO VAN A CAMBIAR
    subTopic("Enum")
    schoolActive.setType(TypeSchool.PRIVATE)
    println(schoolActive.getType())

    //CLASE ANIDADA
    subTopic("Clase Anidada")
    println(teacher.classroom)
    teacher.classroom.key = "3°C"
    println(teacher.classroom)

    //INNER CLASS
    subTopic("Inner")
    println(teacher.classroom.getInfo())

    //INTERFACE
    //ES UNA CLASE INTERMEDIARIA QUE PUEDE MODIFICAR LA FORMA EN QUE VEMOS UNA CLASE
    //SOLO LO QUE SE DEFINE EN LA INTERFAZ ES LO QUE SE PUEDE VER DENTRO DE OTRA CLASE QUE LLAMEN A
    //ESA CLASE PERO COMO INSTANCIA DE LA INTERFAZ
    subTopic("Interface")
    teacher.salary = 1000f
    val boss: Boss = teacher //TEACHER SE INCLUYE YA QUE TIENE LAS CLASES INTERFACE INCLUIDAS EN EL OBJ
    println(boss.namePerson())
    println(boss.netSalary())

    //DATA CLASS
//    Clase enfocada en modelo de datos, son aquellas clases que definen un OBJ como tal
//    PARA USAR data TENEMOS QUE USARLA EN UNA CLASE ANTES DE LA PALABRA class ej: data clase School
//    UNA VEZ DECLARADO data DELANTE DE class SE GENERAN UNOS METODOS
    subTopic("Data class")
    println(schoolActive)
    println(schoolActive.component1()) //METODOS NUEVOS POR USAR data
    val schoolCopy = schoolActive.copy() //COPIAMOS TODAS LAS PROPIEDADES
    schoolCopy.name = "Leolargo" //REEMPLAZO EL VALOR DE LA PROPIEDAD name GRACIAS A data class
    print(schoolCopy)

    //EQUAL & HASHCODE(metodos de data class)
    /*SON PARA DIFERENCIA UN OBJ DE OTRO, AL DECLARAR LA CLASE COMO data class OBTENEMOS METODOS
    * EQUALS Y HASHCODE: LO QUE HACEN ES GENERAR CODIGO PARA EVALUAR SI UN OBJ ES IGUAL O NO A OTRO*/
    subTopic("Equal & Hashcode")
    schoolActive.numCode = "223"
    schoolCopy.numCode = "442"
    println(schoolActive.equals(schoolCopy))

    //TAREA POO
    subTopic("Tarea POO")
    val adu = Adulto("Soto", "Responsabilidad de adulto", 27)
    println(adu.getAdulto())
    println("Soto: ${adu.respons1()} \n ${adu.paseoPerro} \n ${adu.goWork}")
    val home = Responsability("Soto", "En casa", "debe limpiar el piso", 27)
    println("Cuando llego a mi casa ${home.homeWork}")
}