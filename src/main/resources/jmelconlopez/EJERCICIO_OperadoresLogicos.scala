def OperadoresLogicos(): Unit = {
  /** ** Operadores Logicos
   * ---------------------
   * && => significa "y" o "and". Si ambos operadores cumplen con la condicion, el resultado es verdadero
   * || => signica "o" o "or". Si alguno de los operadores cumple con la condicion, el resultado es verdadero
   * ! => se llama operador Not Logico. Se usa para revertir el resultado de la condicion.
   *
   * Ejemplo:
   * Si moises es mayor a 18 anios y menor a 25 imprime ("Moises tiene "numero de edad", moises es joven")
   * Si moises es mayor a 25 anios y menor de 60 imprime ("moises es adulto")
   * Si moises no es mayor de 18 anio imprime ("moises es menor de edad")
   * Si no cumple ninguna imprimir moises es un bebe
   */

  val edadMoises: Int = 66

  if (edadMoises > 18 && edadMoises < 25) {
    println(s"Moises tiene $edadMoises es joven")
  } else if (edadMoises > 25 && edadMoises < 60) {
    println(s"Moises tiene $edadMoises es adulto")
  } else if (!(edadMoises > 18)) {
    println(s"Moises tiene $edadMoises es menor de edad")
  } else {
    println("Moises es inmortal")
  }

  /**
   * EJERCICIO:
   * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_OperadoresLogicos y
   * subir a su carpeta de trabajo
   *
   * Agregar la logica: Donde se identifique que moises es adulto mayor.
   * cuando moises sea mayor de 61 y menor de 110 o cuando moises tenga 60, imprimir ("moises es adulto mayor")
   */

  if (edadMoises > 61 && edadMoises < 110 || edadMoises == 60) {
    println(s"Moises tiene $edadMoises es adulto mayor")
  } else {
    println("Moises es no es adulto mayor")
  }
}