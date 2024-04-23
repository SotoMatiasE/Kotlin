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
}