package com.itformacion.scalacurso.process

import com.typesafe.config.Config
import com.itformacion.scalacurso.data.Deportes

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

    /***
     * Operadores Logicos
     * && => significa "y" o "and". Si ambos operadores cumplen con la condicion, el resultado es verdadero
     * || => signica "o" o "or". Si alguno de los operadores cumple con la condicion, el resultado es verdadero
     * ! => se llama operador Not Logico. Se usa para revertir el resultado de la condicion.
     *
     * Operadores aritmeticos
     * + => suma o agregacion
     * - => resta el segundo valor al primero
     * * => multiplica
     * / => division
     * % => Operador para identificar el resto de la division
     *
     * Operadores relacionales
     * == => evalua dos operandos y si son iguales el resultado es verdadero
     * != => evalua dos operandos y si no son iguales el resultado es verdadero
     * >  => evalua si el operando del lado izquierdo es mayor que el del lado derecho, de ser asi el resultado es verdadero
     * <  => evalua si el operando del lado izquierdo es menor que el del lado derecho, de ser asi el resultado es verdadero
     * >= => evalua si el operando del lado izquierdo es mayor o igual que el del lado derecho, de ser asi el resultado es verdadero
     * <= => evalua si el operando del lado izquierdo es menor o igual que el del lado derecho, de ser asi el resultado es verdadero
     *
     * Expresiones
     * Estructura de la condicion:
     * if (<Expresion boleana>) <expresion>
     *   else <expresion>
     *
     * Ejemplo: Si (edad de moises > 18) println("moises es mayor de edad")
     *          sino println("moises es menor de edad")
     */

    val edadLimite: Int = 18
    val edadMoises: Int = 17

    if (edadMoises > edadLimite){
      println("Moises tiene ", edadMoises, " anios de edad y es MAYOR de edad")
    }else{println("Moises tiene ", edadMoises, " anios de edad y es MENOR de edad")}


    /**
     * Sobrecargando : Tenemos en cuenta que un operador es un metodo de un objeto.
     * Entonces podemos sobrecargar los operadores (metodos) del objeto.
     * Ejemplo:
     */

    //(3 + 2) ==> operador de suma, donde el resultado sera 5
    val resultado = 3 + 2
    println(resultado)
    //int + int = 5

    ///hacemos la funcion suma donde se realiza lo mismo que en la parte superior
    def suma(entero1: Int, entero2: Int): Unit = {
      val resultado = entero1 + entero2
      println(resultado)
    }
    suma(3,2)

    /**
     * Sobrecargando el metodo suma en la clase Deportes
     */
    val deportes = new Deportes("Futbol", 11, 20, "India") +
      new Deportes("Futbol", 10, 11, "Peru")

    println(deportes.practicantes)
    println(deportes.equipos)
    println(deportes.paisNombre)
    println(deportes.nombreDeporte)

    val deportesTem = new Deportes("Futbol", 100, 20, "India") /
      new Deportes("Futbol", 10, 10, "Peru")
    println(deportesTem)

    val depIndia = new Deportes("Futbol", 100, 20, "India")
    val depPeru = new Deportes("Futbol", 10, 10, "Peru")

    val resultadoDivision = depIndia / depPeru

    println(resultadoDivision)

    val temp = depIndia + depPeru
    println(temp.equipos)

    /**
     * Riesgo: Que un developer cree una sobrecarga pero otro developer o alguien que vaya a mantener el software no
     * sepa sobre esta sobrecarga o no la identifique, lo cual haria perder mucho tiempo en el desarrollo o malograria
     * alguna logica ya existente. Se recomienda documentar y comunicar exahustivamente alguna sobrecarga de operadores
     *
     *
     */






    def dup[T](x: T, n: Int): List[T] =
      if (n == 0) Nil
      else x :: dup(x, n - 1)

    println(dup[Int](3, 4)) // linea 5
    println(dup("three", 3)) // linea 6




  }

  def FuncionesMetodosDeLlamadas(): Unit = {

  }

  def MetodoDeAplicacion(): Unit = {

  }

}


