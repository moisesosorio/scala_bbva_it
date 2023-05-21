package com.itformacion.scalacurso

import com.itformacion.scalacurso.process.{Basicos => ba, EstucturasFuncionesDeControl => ef}
import com.typesafe.config.ConfigFactory

/**
 * @author moises osorio
 */
private object ExecutionJob {
  def main(args: Array[String]) {
    val reference = args(0)
    val globalConfig = ConfigFactory.load(reference)
    val configIn = globalConfig.getConfig("ScalaCurso")
    val ejecucionTema = configIn.getString("ejecucionTema")
    ejecucionTema match {
      case "1" => ba.InterpreteDeScala()
      case "2" => ba.DeclarandoValoresVariables()
      case "3" => ba.TiposDeUsoComun()
      case "4" => ba.SobrecaraAritmeticaOperadores()
      case "5" => ba.FuncionesMetodosDeLlamadas()
      case "6" => ef.ExpresionesCondicionales()
      case "7" => ef.Bucles()
      case "8" => ef.AvanzadoParaBuclesYComprensiones()
      case "9" => ef.Procedimientos()
      case "10" => ef.LazyValues()
      case "11" => ef.Excepciones()
    }
  }
}
