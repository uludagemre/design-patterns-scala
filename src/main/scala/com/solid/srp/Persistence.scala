package com.solid.srp

import java.io.{File, PrintStream}
import java.net.URL

class Persistence {
  def saveToFile(course: Course, fileName: String, overwrite: Boolean): Unit = {
    if (overwrite || new File(fileName).exists) try {
      val out = new PrintStream(fileName)
      val printText = course.printContent()
      out.println(printText)
    }
  }

  def load(course: Course, filename: String): Unit = {
  }

  def load(course: Course, url: URL): Unit = {
  }
}
