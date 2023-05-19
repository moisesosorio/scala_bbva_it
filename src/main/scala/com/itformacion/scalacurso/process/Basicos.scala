package com.itformacion.scalacurso.process

import com.typesafe.config.Config
object Basicos {

  def InterpreteDeScala(): Unit = {
    /***
     * Que es el interprete de Scala?
     *
     * Que hace o cual es su trabajo?
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
    println(arrayFrutas(2))
    println(arrayTotal.mkString(","))

    /**
     * Ejercicio: Solicitar al interprete que identifique el area de un triangulo con los siguientes datos:
     * Base = 20
     * Altura = 30
     */

  }

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
    val valorInfiriendoTipo = (20*10)-10/2

    //Asignando el tipo
    val valorAsignandoTipo: Float = (20*13)/3

    println(valorInfiriendoTipo.getClass)
    println(valorAsignandoTipo.getClass)

    //Variable
    var variableInfiriendoTipo = (20 * 10) - 10 / 2

    //Asignando el tipo
    var variableAsignandoTipo: Float = (20 * 13) / 3

    variableAsignandoTipo = 30 * 20

    println(variableInfiriendoTipo)
    println(variableAsignandoTipo)

    /**
     * Ejercicio: Sumar el resultado de la variable variableAsignandoTipo mas el resultado del valor valorInfiriendoTipo
     * y al resultado dividirlo entre 2
     *
     * Imprimir el resultado
     */

  }

  def TiposDeUsoComun(): Unit = {
    /***
     * Cualos son los tipos de datos de uso comun
     */


  }

  def SobrecaraAritmeticaOperadores(): Unit = {

  }

  def FuncionesMetodosDeLlamadas(): Unit = {

  }

  def MetodoDeAplicacion(): Unit = {

  }

}
