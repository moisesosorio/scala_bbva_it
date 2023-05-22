package com.itformacion.scalacurso.data

class Deportes (nombreVar: String, participantesVar: Int, seguidoresVar: Int) {
  val nombre: String = nombreVar
  val participantes: Int = participantesVar
  val seguidores: Int = seguidoresVar

  def &&(dep: Deportes): Deportes = {
    new Deportes(nombre + " AND " + dep.nombre,
      participantes + dep.participantes,
      seguidores + dep.seguidores)
  }
  def ||(dep: Deportes): Deportes = {
    new Deportes(nombre + " OR " + dep.nombre,
      participantes + dep.participantes,
      seguidores + dep.seguidores)
  }
}
