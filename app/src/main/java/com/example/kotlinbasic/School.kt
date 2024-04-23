package com.example.kotlinbasic

//ELEMENTOS CLAVE DE UNA CLASE
//DESPUES TENER LA ESTRUCTURA "class School" PODEMOS TENER PROPERTY Y METODOS
//PODEMOS TENER PROPIEDADES Y FUNCIONES
//SI NO SE INICIA CON UN VALOR SE PUEDE INICIALIZAR EN EL CONSTRUCTOR
//TAMBIEN PODEMOS TENER MAS DE UN constructor
class School(var name: String, var address: String, val active: Boolean = true, var numCode: String ="") { //OBJETO TIPO School CON LA PROPIEDAD name DENTRO DE ESTA MANERA OBLIGAMOS QUE INICIE CON UN VALOR
    var staff: MutableList<Person> //ESTO NO ESTA DECLARADO EN EL constructor, PARA INICIALIZARLO USAMOS EL METODO init


    init { //init FUNCIONA COMO EL METODO main, SE EJECUTA AL INICIO POR DEFECTO
        staff = mutableListOf() //ES DECIR, UNA NUEVA INSTANCIA DE UN ARREGLO DE TIPO mutableList
    }

    constructor(): this("","") //UN CONSTRUCTOR NOS PERMITE HACE UNA NUEVA INSTANCIA// Y PUEDE DARLE VALOR A LAS PROPIEDADES DE LA CLASE

    constructor(name: String, address: String, staff: MutableList<Person>) : this(name,address){
        this.staff = staff //PARA ACCEDER A LA CLASE USAMOS this.PARA DIFERENCIAR Y ACCEDER A LA CLASE UNICAMENTE
    }

    override fun toString(): String {
        if (active){
            return if (staff.size > 0) {
                "name: $name at $address, with ${staff.size} members"
            }else {
                "name: $name at $address"
            }
        }else{
            return "Escuela inactiva2222"
        }
    }

    //USANDO companion object NO ES NECESARIO CREAR UNA INSTANCIA PARA USAR LA CONSTANTE
    companion object{
        const val ACTIVE = true
        const val INACTIVE = false
    }
}