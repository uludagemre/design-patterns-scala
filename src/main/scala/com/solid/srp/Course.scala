package com.solid.srp

import java.io.PrintStream
import java.net.URL
import scala.collection.mutable.ListBuffer

class Course {

  private val entries = ListBuffer[String]()

  private var count = 0

  def addEntry(studentName: String): Unit = {
    count += 1
    entries.append("" + count + ": " + studentName)
  }

  def removeEntry(index: Int): Unit = {
    entries.remove(index)
  }

  def printContent(): String = entries.mkString("\n")

  // Below part breaks single responsibility principle.
  def save(fileName: String): Unit = {
    try {
      val ps = new PrintStream(fileName)
      ps.println(printContent)
    }
  }

  def load(filename: String): Unit = {
  }

  def load(url: URL): Unit = {
  }

}
