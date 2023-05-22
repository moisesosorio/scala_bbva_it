def InterpreteDeScala(): Unit = {
  /** *
   * Que es el interprete de Scala?
   * Es el encargado de interpretar nuestras lineas de codigo escritas y ejecutar sobre la VM de java
   *
   */

  val integerSalida = 1 + 2
  val stringSalida = "Hola Mundo"

  val arrayFrutas = Array("manzana", "peras", "uvas")
  val arrayVerduras = Array("tomate", "col", "coliflor")

  val arrayTotal = arrayFrutas.++(arrayVerduras)

  println(integerSalida)
  println(stringSalida)
  println(arrayFrutas)
  println(arrayTotal.mkString(","))

  //Imprimir el segundo valor dentro del array
  println(arrayFrutas(2))

  /**
   * EJERCICIO:
   * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_InterpreteDeScala y
   * subir a su carpeta de trabajo
   *
   * Solicitar al interprete que identifique el area de un triangulo con los siguientes datos:
   * Area de triangulo = base por altura sobre dos
   * Base = 20
   * Altura = 30
   */

  val altura = 30
  val base = 20

  val area = base * altura / 2
  printf("el Area de nuestro triangulo es: " + area)

}