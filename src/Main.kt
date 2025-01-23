
fun main() {

    val alumno1 = Estudiante("Gonzalo", "52417827E")
    val alumno2 = Estudiante("Pepe", "52417827E")

    val curso1 = Curso("1DAM", "1")

    curso1.agregarAlumno(alumno1)
    alumno2.inscribirse(curso1)

    curso1.mostrarEstudiantes()
}