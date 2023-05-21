package com.itformacion.scalacurso.process

object EstucturasFuncionesDeControl {
  def ExpresionesCondicionales(): Unit = {
    def condicionalesIF(): Unit = {
      /**
       * Las expresiones condicionales son basicamente las sentencias condicionales expresadas en expresiones que devuelven
       * un valor resultante. Un statement no necesariamente devuelve un valor resultante
       * La estructura de las sentencias condicionales son muy parecidas a las de otros lenguajes
       *
       * Ejemplo:
       */

      //Statement
      val x = 1

      if (x < 0) {
        println("negativo")
      } else if (x == 0) {
        println("cero")
      } else {
        println("positivo")
      }

      //Expression
      val a = 10
      val b = 15
      val resultado = if (a < b) {
        a
      } else {
        b
      }

      println(resultado)

      /**
       * EJERCICIO:
       * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_condicionalesIF y
       * subir a su carpeta de trabajo
       *
       * Crear la expresion condicional para identificar que dia de la semana nos encontramos
       * La expression recibira como parametro el dia actual:
       * Donde: Domingo = 1, Lunes = 2, Martes = 3, Miercoles = 4, Jueves = 5, Viernes = 6, Sabado = 7
       *
       * val resultado = expression("2")
       * Resultado = lunes
       */
    }

    def buclesExpression(): Unit = {
      /**
       * Expresiones en loops o bucles
       * Sintaxis: for (x <- "nombre de lista a recorrer")
       *
       */

      //Bucles simple
      //Creamos una lista simple y ejecutamos un for que recorra toda la lista y escriba el resultado
      val ints = List(1, 2, 3, 4, 5)
      for (i <- ints) println(i)

      //Dentro del for colocamos tambien se pueden colocar condiciones a evaluar
      for (i <- ints if i > 2) println(i)

      //Podemos usar multiples loops y condiciones dentro de un mismo for
      for {
        i <- 1 to 5
        j <- 'a' to 'd'
        if i == 2
        if j == 'b'
      } {
        println(s"i = $i, j = $j")
      }

      //Transformamos el for en una expression
      //Se utiliza la palabra definida "yield" en lugar de "do" para tener mejor performance en la ejecucion
      val doubles = for (i <- ints) yield i * 2
      println(doubles)

      //La sintaxis del for puede variar entre las siguientes
      val doubles1 = for (i <- ints) yield i * 2
      val doubles2 = for (i <- ints) yield (i * 2)
      val doubles3 = for {i <- ints} yield (i * 2)

      //Ejecutamos la funcion capitalize para cambiar la primera letra de la palabra a mayuscula
      val nombres = List("chris", "ed", "maurice")
      val capNombres = for (nombre <- nombres) yield nombre.capitalize
      println(capNombres)

      //Evaluamos que la longitud del string sea mayor a 4 caracteres y cuando cumpla esa condicion devolvemos en la expresion
      val frutas = List("apple", "banana", "lime", "orange")
      val frutasLengths = for (f <- frutas if f.length > 4) yield f.length
      println(frutasLengths)

      //Tener en cuenta que siempre hemos devuelto una lista.

      /**
       * EJERCICIO:
       * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_buclesExpression y
       * subir a su carpeta de trabajo
       *
       * Utilizar la siguiente lista List(2,3,4,5,6) para devolver la suma de los valores pares de la lista
       *
       */
    }

    def matchExpression(): Unit = {
      /**
       * La sintaxis the match is very simple, debe tener en cuenta que por defecto el match es una expression dado que
       * devuelve un dato de la evaluacion
       *
       * Sintaxi:
       * "valor" match { case 1 => "tarea a realizar" ...}
       */

      /**
       * Para el siguiente caso match es utilizado para imprimir una cadena, sin embargo puede ser utilizado para ejecutar
       * una funcion, metodo, tarea, clase o etc.
       *
       * */

      val i = 3

      i match {
        case 1 => println("one")
        case 2 => println("two")
        case _ => println("other")
      }

      /**
       * match devolviendo un valor como expression
       */

      //Creamos una funcion para evaluar el dato que llega y devolver una cadena
      val x = 2

      def funcionMatch(valor: Int): String = {
        if (valor == 1) "uno"
        else "dos"
      }

      //Enviamos la evaluacion del match a la funcion y retornamos el valor
      val resultado2 = x match {
        case 1 => funcionMatch(x)
        case 2 => funcionMatch(x)
        case _ => "other"
      }
      println(resultado2)

      /**
       * EJERCICIO:
       * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_matchExpression y
       * subir a su carpeta de trabajo
       *
       * Crear una funcion que reciba una parametro de tipo string y que lo convierta en mayusculas y otra funcion
       * que reciba un parametro de tipo string y lo convierta en minusculas.
       * Crear una clase persona con un solo campo de tipo nombre y instanciar con el valor moises y luego cambiar por juan
       * Crear un match que evalue la clase persona creada anteriormente y que evalue el campo nombre y si el nombre
       * es moises entonces debera ejecutar la funcion creada para transformar a mayusculas y si el nombre es juan
       * debera ejecutar la funcion creada para transformar a minusculas, si no es ninguna de las anteriores deber imprimir ("N/A")
       *
       */
    }

    //condicionalesIF()
    //buclesExpression()
    //matchExpression()
  }

  def Bucles(): Unit = {

    /**
     * Bucles: Objetivo recorrer un arreglo, lista, sequencia, vector, etc y ejecutar reglas de negocio dentro de los mismos
     * Sintaxis:
     * foreach ===> "objeto a recorrer".foreach { elemento => tarea a ejecutar por cada elemento }
     * for yield => for( elemento <- "objeto a recorrer") yield "tarea a ejecutar por cada elemento"
     * while =====> while ( elemento condicion) { "tarea a ejecutar por cada elemento" }
     *
     */

    //Creamos un objeto de tipo vector y lo recorremos con foreach
    val vec = Vector((1, 2), (3, 4), (5, 6), (7, 8), (9, 0))

    //utilizamos la sentencia case para definir el formato del objeto que se encuentra dentro del vector.
    //Similar a un case class que define al objeto
    vec.foreach { case (i, j) => println(i, j) }

    //Creamos un objeto de tipo array y lo recorremos con for yield para que cada elemento se multiplique por 2
    val mi_array = Array(1, 2, 3, 4, 5)
    for (x <- mi_array) yield x * 2

    //Recorremos la longitud de numeros menores a 10 pero mayores o iguales 5 con while
    var x = 5;
    while (x < 10) {
      println("Valor: " + x)
      x = x + 1
    }

    /**
     * EJERCICIO:
     * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_Bucles y
     * subir a su carpeta de trabajo
     *
     * Con la siguiente lista List(1,2,3,4,5,6,7,8,9,10), recorrer con for yield e imprimir solo los numeros que son
     * primos.
     *
     * Un numero primo es aquel que solo tiene dos divisores positivos y son la unidad y por si mismo
     */

  }

  def ArgumentosPredeterminadosNombre(): Unit = {

  }

  def ArgumentosVariables(): Unit = {

  }

  def Procedimientos(): Unit = {

  }

  def LazyValues(): Unit = {


  }

  def Excepciones(): Unit = {

  }


}
