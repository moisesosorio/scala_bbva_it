/**
 * EJERCICIO:
 * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_OperadoresLogicos y
 * subir a su carpeta de trabajo
 *
 * Agregar la logica: Donde se identifique que moises es adulto mayor.
 * cuando moises sea mayor de 61 y menor de 110 o cuando moises tenga 60, imprimir ("moises es adulto mayor")
 */
println ("\n")
println ("Ejercicio 4")
println ("\n")
val edadMoises: Int = 60

if (edadMoises > 18 && edadMoises < 25) {
  println(s"Moises tiene $edadMoises es joven")
} else if (edadMoises > 25 && edadMoises < 60) {
  println(s"Moises tiene $edadMoises es adulto")
} else if (!(edadMoises > 18)) {
  println(s"Moises tiene $edadMoises es menor de edad")
} else if ( (edadMoises > 60 && edadMoises < 110) || edadMoises == 60) {
  println(s"moises es adulto mayor")
} else {
  println("Moises es inmortal")
}
println ("\n")
println ("\n")

}