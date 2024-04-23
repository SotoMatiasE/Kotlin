package com.example.kotlinbasic
//VAMOS A HABILITAR LA HERENCIA
//EN LA HERENCIA VA A LLEVAR LAS VARIABLES DE LA CLASE PADRE SIN var o val
//LUEGO FUERA DE PARENTESIS : Y LA CLASE PADRE ()
//return super.showWork() SUPER ES REFERENCIA A LA CLASE PADRE

class Teacher(firstName:String, lastName: String, var students: Short) : Person(firstName, lastName),
    Boss {
    var classroom: ClassRoom = ClassRoom(("N/A"))
    override fun showWork(): String {
        return super.showWork() + "\nDando clases.."
    }
    //INTERFACE BOSS
    override fun namePerson(): String = getFullName()
    //INTERFACE BOSS
    override fun netSalary(): Float = salary

    //CLASE ANIDADA + INNER CLASS
    //INNER ES UN TIPO PARA ACCEDER A LAS PROPIEDADES DE LA CLASE PADRE
    inner class ClassRoom(var key: String){ //CLASE ANIDADA
        override fun toString(): String {
            return "ClassRoom: $key"
        }
        //AHORA PUEDO CREAR UN METODO DENTRO DE LA CLASE ANIDADA
        fun getInfo(): String = "Classroom ${key} whit Teacher $firstName and $students students"
    }
}
