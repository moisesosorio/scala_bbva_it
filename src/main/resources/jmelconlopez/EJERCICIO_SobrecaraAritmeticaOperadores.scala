import com.itformacion.scalacurso.data.Deportes
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
    val edadMoises: Int = 66

    if (edadMoises > edadLimite) {
      println(s"Moises tiene  $edadMoises anios de edad y es MAYOR de edad")

    } else {
      println(s"Moises tiene  $edadMoises anios de edad y es MENOR de edad")
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
    } else {
      println("Moises descansa")
    }
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
   * Tomar una foto al resultado y al codigo y subir en un archivo con nombre EJERCICIO_SobrecaraAritmeticaOperadores y
   * subir a su carpeta de trabajo
   *
   * Crear una clase de nombre Deportes que tenga los parametros nombre, participantes y seguidores, luego crear un metodo
   * u operador logico para sobrecargar la evaluacion de las siguientes instancias:
   * instancia1 = deportes("futbol", 11, 10000)
   * instancia2 = deportes("basketbol", 6, 3000)
   *
   * Utiliar los operadores logicos AND, OR.
   */

  //Instanciamos la clase deportes
  val deporte_futbol = new Deportes("futbol", 11, 10000)
  val deporte_baloncesto = new Deportes("basketbol", 6, 3000)

  var deporteand = deporte_futbol && deporte_baloncesto
  var deporteor = deporte_baloncesto || deporte_futbol

  println(deporteand.nombre)
  println(deporteand.participantes)
  println(deporteand.seguidores)

  println(deporteor.nombre)
  println(deporteor.participantes)
  println(deporteor.seguidores)

}