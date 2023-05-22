package com.itformacion.scalacurso.data

class Deportes (nombreV: String, participantesV: Int, seguidoresV: Int) {
  val nombre: String = nombreV
  val participantes: Int = participantesV
  val seguidores: Int = seguidoresV

  def +(dep: Deportes): Deportes = {
    new Deportes(nombre + " - " + dep.nombre,
      participantes + dep.participantes,
      seguidores + dep.seguidores)
  }
}
