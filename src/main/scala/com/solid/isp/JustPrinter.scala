package com.solid.isp

class JustPrinter extends IPrinter {
  override def print(): Unit = {
    println("Printing")
  }
}
