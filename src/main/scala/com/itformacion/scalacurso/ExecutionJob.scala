package com.itformacion.scalacurso

import com.typesafe.config.ConfigFactory
import com.itformacion.scalacurso.process.{Basicos => ba}

/**
 * @author ${user.name}
 */
private object ExecutionJob {
  def main(args : Array[String]) {
    val reference = args(0)
    val globalConfig = ConfigFactory.load(reference)
    val configIn = globalConfig.getConfig("ScalaCurso")
    val ejecucionTema = configIn.getString("ejecucionTema")
    ejecucionTema match {
      case "1" => ba.InterpreteDeScala(configIn)
      case "2" => ba.DeclarandoValoresVariables()
      case "3" => ba.TiposDeUsoComun()
      case "4" => ba.SobrecaraAritmeticaOperadores()
      case "5" => ba.FuncionesMetodosDeLlamadas()
      case "6" => ba.MetodoDeAplicacion()
    }
  }
}
