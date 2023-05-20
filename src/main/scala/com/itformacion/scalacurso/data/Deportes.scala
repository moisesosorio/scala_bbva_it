package com.itformacion.scalacurso.data

class Deportes(nombreVar: String, practicantesVar: Int, equiposVar: Int, paisVar: String){
  val nombreDeporte: String = nombreVar
  val practicantes: Int = practicantesVar
  val equipos: Int = equiposVar
  val paisNombre: String = paisVar

  def +(dep: Deportes): Deportes = {
    new Deportes(nombreDeporte + " - " + dep.nombreDeporte,
      practicantes + dep.practicantes,
      equipos + dep.equipos,
      paisNombre + " - " + dep.paisNombre)
  }

  def /(deportes: Deportes): Double = {
    practicantes / deportes.equipos
  }

}
