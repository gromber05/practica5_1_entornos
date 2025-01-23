
class Curso(private val nombre: String, private val codigo: String){

    var estudiantes: MutableList<Estudiante> = mutableListOf()
        get() = field

    fun agregarAlumno(alumno: Estudiante) {
        estudiantes.add(alumno)
    }

    fun mostrarEstudiantes() {
        for (i in estudiantes) {
            println(i)
            println("${i.nombre} | ${i.DNI}")
            println("")
        }
    }
}