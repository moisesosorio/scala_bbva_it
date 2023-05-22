package com.itformacion.scalacurso.data

class Deportes(nombreVar: String, participantesVar: Int, seguidoresVar: Int) {
  val nombre: String = nombreVar
  val participantes: Int = participantesVar
  val seguidores: Int = seguidoresVar

  def +(dep: Deportes): Deportes = {
    new Deportes(
      nombre + " - " + dep.nombre,
      participantes + dep.participantes,
      seguidores + dep.seguidores)
  }
}
