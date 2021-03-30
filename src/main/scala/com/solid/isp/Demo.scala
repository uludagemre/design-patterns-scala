package com.solid.isp

object Demo {
  def main(args: Array[String]): Unit = {
    val oldPrinter = new OldFashionedPrinter()
    useIt(oldPrinter)
    val multiFunctionDevice = new MultiFunctionDevice()
    useIt(multiFunctionDevice)
  }

  def useIt(device: Any): Unit = {
    try {
      val printerDevice = device.asInstanceOf[IPrinter]
      printerDevice.print()
      val scannerDevice = device.asInstanceOf[IScaner]
      scannerDevice.scan()
    } catch {
      case e: Throwable =>
        println(e)
    }
  }
}
