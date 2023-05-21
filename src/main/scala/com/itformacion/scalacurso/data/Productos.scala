package com.itformacion.scalacurso.data


class Productos(nombreVar: String, precioVar: Int, stockVar: Int, vencimientoVar: String){
  val nombre: String = nombreVar
  val precio: Int = precioVar
  val stock: Int = stockVar
  val vencimiento: String = vencimientoVar

  def +(prod: Productos): Productos = {
    new Productos(nombre + " - " + prod.nombre,
      precio + prod.precio,
      stock + prod.stock,
      vencimiento + " - " + prod.vencimiento)
  }

  def -(prod: Productos): Productos = {
    new Productos(nombre + " - " + prod.nombre,
      precio - prod.precio,
      stock - prod.stock,
      vencimiento + " - " + prod.vencimiento)
  }

  def /(prod: Productos): Double = {
    precio / prod.precio
  }

  def *(prod: Productos): Double = {
    stock * prod.stock
  }

  def %(prod: Productos): Double = {
    precio % prod.precio
  }
}
