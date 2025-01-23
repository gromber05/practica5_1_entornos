
class Curso(private val nombre: String, private val codigo: String, estudiantes: MutableList<Estudiante>){

    var estudiantes: MutableList<Estudiante> = mutableListOf()
        get() = field
        private set


    fun agregarAlumno(alumno: Estudiante) {
        estudiantes.add(alumno)
    }

    fun mostrarEstudiantes() {
        for (i in estudiantes) {
            println(i)
            println("${i.nombre} | ${i.DNI}")
        }
    }
}

class Estudiante(val nombre: String, val DNI: String) {

    fun inscribirse(curso: Curso) {
        curso.estudiantes.add(this)
    }
}

fun main() {

    val alumno1 = Estudiante("Gonzalo", "52417827E")
    val alumno2 = Estudiante("Pepe", "52417827E")

    val curso1 = Curso("1DAM", "1", mutableListOf(alumno1, alumno2))

    curso1.mostrarEstudiantes()

}