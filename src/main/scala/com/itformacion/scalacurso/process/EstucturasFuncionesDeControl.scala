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

  def AvanzadoParaBuclesYComprensiones(): Unit = {
    /** *
     * For-comprenhension para avanzados bucles
     * El siguiente for-comprenhension retorna un valor que se guarda en la variable listaResultante y luego es recorrido
     * por un foreach
     */

    //Creamos una case class para definir el objeto usuario, solo tiene nombre y edad
    case class Usuario(nombre: String, edad: Int)

    //Creamos la lista usuarioBase con los datos de los usuarios
    val usuarioBase = List(
      Usuario("Travis", 28),
      Usuario("Kelly", 33),
      Usuario("Jennifer", 44),
      Usuario("Dennis", 23))

    //Creamos el valor listaResultante donde guardaremos la evaluacion dentro del for (guards)
    val listaResultante =
      for (user <- usuarioBase if user.edad >= 20 && user.edad < 30)
        yield user.nombre

    listaResultante.foreach(println)

    /**
     * El siguiente for-comprenhension no retorna ningun valor, sino que tiene por retorno un Unit y las logica
     * esta dentro del for y tambien tiene guards para el operador j
     */

    def verificar(x: Int) =
      for (i <- 0 until 5;
           j <- 0 until 5 if i * j >= x) {
        val multiplo = i * 2
        val divisor = j / 2

        println(s"($i, $j)")
        println(s"multiplo $multiplo y divisor: $divisor")
      }

    verificar(5)

    /**
     * EJERCICIO:
     * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_AvanzadoParaBuclesYComprensiones y
     * subir a su carpeta de trabajo
     *
     * Crear un sequencial (seq) que contenga la case class deportes con dos atributos nombre(String) y seguidores(int)
     * Que el sequencial tenga al menos 6 componentes
     *
     * Ejecutar un for comprehension donde se pinte solo los deportes que tengan mas de 1000 seguidores
     *
     */
  }

  def Procedimientos(): Unit = {
    /** *
     * Un procedimiento es una funcion sin valor retornado, es decir una funcion que retorna Unit
     *
     * EJERCICIO:
     * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_Procedimientos y
     * subir a su carpeta de trabajo
     *
     * Crear un procedimiento que utilice un for-comprehension para cambiar de mayusculas as minusculas la primera y ultima
     * letra de cada palabra en un arreglo que llegue como parametro.
     * Cuando es mayuscula poner minuscula y cuando es minuscula poner mayuscula. utilizar las funciones toLowerCase y toUpperCase
     *
     * procedimiento(Array["Moises", "osorio", "bernaL"]
     * resultado: moiseS, OsoriO, Bernal
     *
     */
  }

  def LazyValues(): Unit = {
    /** *
     * Por definicion los valores Lazy son ejecutados cuando se acceden a estos a diferencia de los valores normales
     * que son ejecutados cuando se definen. Es decir, un valor lazy solo ocupa memoria cuando es ejecutado mas no cuando
     * se definen.
     *
     * RIESGO: Es bueno utilizar lazy values en todo momento?. Debemos tener en cuenta que al no ejecutar el metodo u objeto de manera
     * pronta se podria generar un encolamiento y por ende un error de timeout de acceso a la variable. Es conocido como deadbloack.
     *
     * Se recomienda usar lazyval para los valores que no seran usados mas que una vez en el programa y de esta manera no consumir
     * recursos ni generar deadblock en el software
     *
     */

    //Creamos un valor x con 15, el valor x al ser creado y ejecutado ya consume memoria
    val x = 15

    //Creamos un lazy valor y, el valor no consume memoria sino hasta que se accede a el por primera vez
    lazy val y = {
      println("Inicializando");
      17
    }

    //Ejecutamos las valores
    x
    y

    //En el siguiente ejemplo se esta tratando de visualizar una practica que podria generar errores y/o riesgos
    //en el desarrollo del software. La llamada a lazy values en diferente metodos de manera cruzada, esto para
    //simular una instancia de multiples hilos o ejecuciones en paralelo.
    //No da error en la maquina local pero dentro de un proceso de ejecucion paralela en un servidor esta tecnica
    //podria generar problemas y errores de deadblock
    object Persona {
      lazy val inicial = 30
      lazy val edad = Humano.inicial //llamamos a un lazy val de otro objeto
    }

    object Humano {
      lazy val inicial = Persona.inicial //llamamos a un lazy val de otro objeto
    }

    def ejecutar(): Unit = {
      val resultado = List(Persona.edad, Humano.inicial)
      println(resultado)
    }

    ejecutar()
  }

  def Excepciones(): Unit = {
    /**
     * El manejo de excepciones es muy importante en la programacion de todo tipo. Scala nos da la capacidad de manejar
     * los errores de manera bastante customizable,
     */

    //Objeto de muestra para crear clases que extiendan RuntimeException
    object CalculadorExceptions {
      class ExcepcionDeEnteroSobrecargado extends RuntimeException

      class ExcepcionDeNumerosNegativos extends RuntimeException
    }

    //Objeto con logica de negocio donde se coloca la logica temporal solo para demostracion del manejo de errores
    object Calculador {

      import CalculadorExceptions._

      def suma(a: Int, b: Int): Int = {
        //Artificio para caer en la excepcion de tipo valor negativo
        if (a < 0) throw new ExcepcionDeNumerosNegativos

        //Evaluacion
        val result = a + b

        //Artificio para caer en la excepcion de tipo sobrecarga de entero
        if (result < 0) throw new ExcepcionDeEnteroSobrecargado
        result
      }
    }

    //Objeto con logica de negocio donde se encontraria el try/catch

    import CalculadorExceptions._
    def tryCatch(a: Int, b: Int): Int = {
      try {
        Calculador.suma(a, b)
      } catch {
        case e: ExcepcionDeEnteroSobrecargado => -1
        case e: ExcepcionDeNumerosNegativos => -2
      } finally {
        //Esta parte del codigo siempre se va a ejecutar y siempre ejecutara al final del programa donde se encuentra
        //el try/cath/finally
        println("Calculo hecho!")
      }
    }

    println(tryCatch(3, -4))

    /**
     * EJERCICIO:
     * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_Procedimientos y
     * subir a su carpeta de trabajo
     *
     * Crear dos procedimientos donde se muestre un mensaje customizado del manejo de errores y agregar esos
     * procedimientos a la funcion creada en la parte de arriba para el manejo de errores cuando los errores sean
     * de numeronegativos y tambien de enterores sobrecargados
     *
     * Ademas, agregar un case de excepcion mas a la logica del try catch en la parte superior
     *
     * */
  }


}
