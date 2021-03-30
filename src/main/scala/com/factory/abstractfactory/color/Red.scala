package com.factory.abstractfactory.color

class Red extends Color {
  override def fill(): Unit = {
    println("Red was filled.")
  }
}
