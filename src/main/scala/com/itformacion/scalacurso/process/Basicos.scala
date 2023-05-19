package com.itformacion.scalacurso.process

import com.typesafe.config.Config
object Basicos {

  def InterpreteDeScala(config: Config): Unit = {
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
     * Ejercicio:
     *
     */


    //    def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
//
//    println("Hello World!")
//    println("concat arguments = " + foo(args))

  }

  def DeclarandoValoresVariables(): Unit = {

  }

  def TiposDeUsoComun(): Unit = {


  }

  def SobrecaraAritmeticaOperadores(): Unit = {

  }

  def FuncionesMetodosDeLlamadas(): Unit = {

  }

  def MetodoDeAplicacion(): Unit = {

  }

}
