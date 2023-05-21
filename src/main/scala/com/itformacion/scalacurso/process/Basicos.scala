package com.itformacion.scalacurso.process

import com.typesafe.config.Config
import com.itformacion.scalacurso.data.Productos

object Basicos {

  def InterpreteDeScala(): Unit = {
    /***
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
    println(arrayFrutas(2))
    println(arrayTotal.mkString(","))

    /**
     * EJERCICIO:
     * Solicitar al interprete que identifique el area de un triangulo con los siguientes datos:
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
    //NOTESE: Que el IDE nos recomienda utilizar val al no reasignar el valor de la variable dentro del objeto
    var variableInfiriendoTipo = (20 * 10) - 10 / 2

    //Asignando el tipo
    //NOTESE: Que el IDE se reaisgna el valor por ende se comprueba que la variable es valida.
    var variableAsignandoTipo: Float = (20 * 13) / 3

    variableAsignandoTipo = 30 * 20

    println(variableInfiriendoTipo)
    println(variableAsignandoTipo)

    /**
     * EJERCICIO:
     * Sumar el resultado de la variable variableAsignandoTipo mas el resultado del valor valorInfiriendoTipo
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
    def Expresiones(): Unit = {
      /** ** Expresiones
       * --------------
       * Estructura de la condicion en seudocodigo:
       * if (<Expresion boleana>) <expresion>
       * else <expresion>
       *
       * Ejemplo: Si (edad de moises > 18) imprime("moises es mayor de edad")
       * sino imprime("moises es menor de edad")
       */

      val edadLimite: Int = 18
      val edadMoises: Int = 19

      if (edadMoises > edadLimite) {
        println("Moises tiene ", edadMoises, " anios de edad y es MAYOR de edad")
      } else {
        println("Moises tiene ", edadMoises, " anios de edad y es MENOR de edad")
      }
    }

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

      val edadMoises: Int = 120

      if (edadMoises > 18 && edadMoises < 25){
        println("Moises tiene ", edadMoises, " es joven")
      }else if(edadMoises > 25 && edadMoises < 60){
        println("Moises tiene ", edadMoises, " es adulto")
      }else if (!(edadMoises > 18)){
        println("Moises tiene ", edadMoises, " es menor de edad")
      }else {println("Moises es inmortal")}

      /**
       * EJERCICIO:
       * Agregar la logica: Donde se identifique que moises es adulto mayor.
       * cuando moises sea mayor de 61 y menor de 110 o cuando moises tenga 60, imprimir ("moises es adulto mayor")
       */
    }

    def OperadoresAritmeticos(): Unit = {
      /** ** Operadores aritmeticos
       * -------------------------
       * + => suma o agregacion
       * - => resta el segundo valor al primero
       * * => multiplica
       * / => division
       * % => Operador para identificar el resto de la division
       */
      val resultadoSuma = 3 + 2
      println(resultadoSuma)
      println(resultadoSuma.getClass)

      val resultadoResto = 16 / 2 //16/2 = 8 con resto 0
      println(resultadoResto)
      println(resultadoResto.getClass)
    }

    def OperadoresRelacionales(): Unit = {
      /** ** Operadores relacionales
       * --------------------------
       * == => evalua dos operandos y si son iguales el resultado es verdadero
       * != => evalua dos operandos y si no son iguales el resultado es verdadero
       * >  => evalua si el operando del lado izquierdo es mayor que el del lado derecho, de ser asi el resultado es verdadero
       * <  => evalua si el operando del lado izquierdo es menor que el del lado derecho, de ser asi el resultado es verdadero
       * >= => evalua si el operando del lado izquierdo es mayor o igual que el del lado derecho, de ser asi el resultado es verdadero
       * <= => evalua si el operando del lado izquierdo es menor o igual que el del lado derecho, de ser asi el resultado es verdadero
       */

      val edadMoises: Int = 120
      val edadLimite: Int = 100

      if ((edadMoises != edadLimite) && (edadMoises < edadLimite)) {
        println("Moises tiene aun vive")
      } else if (edadMoises == edadLimite) {
        println("Moises esta por descansar")
      } else {println("Moises descansa")}
    }

    /**
     * Ejecucion de metodos
     */
    //Expresiones()
    //OperadoresLogicos()
    //OperadoresAritmeticos()
    //OperadoresRelacionales()

    /**
     * Sobrecargando : Tengamos en cuenta que en Scala un operador es el metodo de un objeto.
     * Entonces podemos sobrecargar los operadores (metodos) del objeto como cualquier otro metodo dentro de una clase
     *
     * Ejemplo: Para realizar la suma de operandos normalmente usamos la sintaxis operando1 + operando2 o utilizamos una
     * funcion (factory) para realizar de suma de algun objeto mas complejos.
     */

      ///hacemos la funcion suma donde se realiza la misma operacion aritmetica en la parte de operadores aritmeticos
      def suma(entero1: Int, entero2: Int): Unit = {
        println(entero1 + entero2)
      }
    //Decomentar para validar
      //suma(3,2)

    //Creamos una clase para simiular un objeto complejo y sumar sus datos
    //Creacion de case class
      case class TestSuma(entero1: Int, entero2: Int)
    //Instanciamos la clase
    val numeros = TestSuma(3, 2)

    //Ejecutamos el metodo suma
    //Decomentar para validar
    //suma(numeros.entero1, numeros.entero2)

    /**
     * Ahora lo que vamos a crear es una clase que se pueda sobreaargar el metodo suma y demas metodos
     * Sobrecargando el metodo suma en la clase Deportes
     *
     * 1. Crear clase Productos
     * 2. Agregar variables a la clase
     * 3. Crear los metodos aritmeticos o operadores aritmeticos a sobrecargar
     * 4. Importar la clases en el objeto
     * 5. Instanciar la clase
     * 6. Ejecutar las operaciones aritmeticas
     */

      //Instanciamos la clase productos
    val hipotecarioVerde = new Productos("Hipotecario Verde", 200, 20, "Junio")
    val hipotecarioMiVivienda = new Productos("Mi Vivienda", 100, 10, "Diciembre")

    //Validamos operacion sobrecargada de SUMA
    val hipotecariosSuma = hipotecarioVerde + hipotecarioMiVivienda
    println(hipotecariosSuma.nombre)
    println(hipotecariosSuma.precio)
    println(hipotecariosSuma.stock)
    println(hipotecariosSuma.vencimiento)

    //Validamos la operacion sobrecarga de DIVISION
    val hipotecariosDivision = hipotecarioVerde / hipotecarioMiVivienda
    println(hipotecariosDivision)

    /**
     * Riesgo: Que un developer cree una sobrecarga pero otro developer o alguien que vaya a mantener el software no
     * sepa sobre esta sobrecarga o no la identifique, lo cual haria perder mucho tiempo en el desarrollo o malograria
     * alguna logica ya existente. Se recomienda documentar y comunicar exahustivamente alguna sobrecarga de operadores
     *
     * EJERCICIO:
     * Crear una clase de nombre Deportes que tenga los parametros nombre, participantes y seguidores, luego crear un metodo
     * u operador logico para sobrecargar la evaluacion de las siguientes instancias:
     * instancia1 = deportes("futbol", 11, 10000)
     * instancia2 = deportes("basketbol", 6, 3000)
     *
     * Utiliar los operadores logicos AND, OR.
     */
  }

  def FuncionesMetodosDeLlamadas(): Unit = {

    /***
     * Funcion: Sin parametros
     * Funcion basica donde ejecutamos reglas de negocio dentro de un funcion que no recibe parametros ni devuelve valores
     */
    def funcion_sin_parametros(): Unit = println("¡Hola, mundo!")
    funcion_sin_parametros()

    /***
     * Funcion: Con parametros
     * Aqui vemos una funcion comun donde enviamos parametros y retornamos un tipo de dato Int con el valor resultante
     * de la suma entre ambos parametros de entrada
     */
    def suma(x: Int = 2, y: Int = 3): Int = x + y
    val resultado = suma(2, 3)
    println(resultado)

    /**
     * Funcion: con numero de parametros variable
     * Aqui enviamos una serie de argumentos como parametros, los cuales nos ayudan a procesar. No devolvemos nada.
     */
    def funcion_con_varios_argumentos(args: String*): Unit = {
      var i: Int = 0;
      for (arg <- args) {
        i = i + 1;
      }
    }
    funcion_con_varios_argumentos("primero","segundo")

    /**
     * Funcion: Anonima
     * Llamamos anonima porque no le damos nombre, como en los casos anteriores. Solo creamos la logica y el resultado lo guardamos
     * dentro de una variable. Ademas, podemos enviar parametros para su procesamiento.
     *
     * estos caracteres "=>" son conocidos como transformador
     * El transformador se usa para transformar la lista de parámetros del lado izquierdo del símbolo
     * en un nuevo resultado usando la expresión presente en el lado derecho.
     *
     * estos caracteres "_" son conocidos como comodin
     * Es una forma abreviada de representar un parámetro que aparece solo una vez en la función anónima
     *
     */
      //Funcion anonima con parametros
    val funcAnonima1 = (x: Int, y: Int) => x + y
    println("funcAnonima1 : " + funcAnonima1(3, 2))

    //Funcion anonima con wildcard. Tener en cuenta que los valores solo aparecen una vez
    val funcAnonima2 = (_:Int) * (_:Int)
    println("funcAnonima2 : " + funcAnonima2(4, 5))

    //Funcion anonima sin parametros
    val funcAnonima3 = () => { val x = 10; val y = 2; x*y }
    println("funcAnonima3 : " + funcAnonima3())

    /**
     * Funciones llamada por valor
     * En estas funciones los cambios realizados en el parametro no se envian de vuelta a quien llama a la funcion
     * sintaxis: def llamadaPorValor(x: Int)
     */
    def llamadaPorValor(x: Int): Unit = {
      println("valor1: " + x)
      println("valor2: " + x)
      println("valor3: " + x)
    }

    var Valor = 0
    llamadaPorValor{
      Valor +=1; Valor
    }

    /**
     * Funciones llamada por nombre
     * En estas funciones los cambios realizados en el parametro se envian de vuelta a quien llama a la funcion
     * sintaxis: def llamadaPorNombre(x: => Int)
     */
    def llamadaPorNombre(x: => Int): Unit = {
      println("Nombre1: " + x)
      println("Nombre2: " + x)
      println("Nombre3: " + x)
    }

    var Nombre = 0
    llamadaPorNombre {
      Nombre += 1;
      Nombre
    }

    /**
     * EJERCICIO:
     * Crear una funcion principal que reciba 2 parametros (edad y anio) y que contenga:
     * 1. funcion anonima para definir verdadero cuando la edad es menor al anio
     * 2. funcion de llamada por nombre donde se reste la el anio menos la edad y retorne el anio de nacimiento
     *
     * println(identificarAnioNacimiento(37, 2023))
     * resultado: 1986
     *
     * Imprimir el resultado
     */
  }

  def MetodoDeAplicacion(): Unit = {

  }

}


