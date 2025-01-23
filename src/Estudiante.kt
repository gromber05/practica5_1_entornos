
class Estudiante(val nombre: String, val DNI: String) {

    fun inscribirse(curso: Curso) {
        curso.estudiantes.add(Estudiante(nombre, DNI))
    }
}