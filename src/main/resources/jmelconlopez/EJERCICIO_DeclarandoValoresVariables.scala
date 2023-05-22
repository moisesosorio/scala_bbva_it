def DeclarandoValoresVariables(): Unit = {
  /**
   * Que es una variable?
   * Es cuando se da al resultado de una expresion un nombre usando la palabra reservada "var"
   * Se puede computar o reasignar y si se puede referenciar. Conocido tambien como mutable
   *
   * Que es un valor?
   * Es cuando se da al resultado de una expresion un nombre usando la palabra reservada "val"
   * No se puede computar o reasignar pero si se puede referenciar. Conocido tambien como inmutable
   *
   * NOTA: Se puede inferir el tipo de una variable y de un valor y/o tambien se le puede asignar
   */

  //Valor
  val valorInfiriendoTipo = (20 * 10) - 10 / 2

  //Asignando el tipo
  val valorAsignandoTipo: Float = (20 * 13) / 3

  println(valorInfiriendoTipo.getClass)
  println(valorAsignandoTipo.getClass)

  //Variable
  var variableInfiriendoTipo = (20 * 10) - 10 / 2
  //NOTESE: Que el IDE nos recomienda utilizar val al no reasignar el valor de la variable dentro del objeto

  //Asignando el tipo
  var variableAsignandoTipo: Float = (20 * 13) / 3
  //NOTESE: Que el IDE se reaisgna el valor por ende se comprueba que la variable es valida.

  variableAsignandoTipo = 30 * 20

  println(variableInfiriendoTipo)
  println(variableAsignandoTipo)

  /**
   * EJERCICIO:
   * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_DeclarandoValoresVariables y
   * subir a su carpeta de trabajo
   *
   * Sumar el resultado de la variable variableAsignandoTipo mas el resultado del valor valorInfiriendoTipo
   * y al resultado dividirlo entre 2
   *
   * Imprimir el resultado
   */

   val resultado = (variableAsignandoTipo + variableInfiriendoTipo) /2
  println("el resultado de la variable variableAsignandoTipo mas el resultado del valor valorInfiriendoTipo y dividirlo entre 2 es : " + resultado)

}