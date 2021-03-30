package com.solid.isp

class OldFashionedPrinter extends Machine {
  override def print(): Unit = {
    println("Printing")
  }

  override def fax(): Unit = {
    throw new NotImplementedError("fax is not implemented")
  }

  override def scan(): Unit = {
    throw new NotImplementedError("scan is not implemented")
  }
}
