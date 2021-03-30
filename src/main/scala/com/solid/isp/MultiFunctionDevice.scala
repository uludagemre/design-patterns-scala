package com.solid.isp

class MultiFunctionDevice extends IMultiFunctionDevice {
  override def print(): Unit = {
    println("Printing")
  }

  override def scan(): Unit = {
    println("Scanning")
  }
}
