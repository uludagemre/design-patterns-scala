package com.solid.srp

object Demo {
  def main(args: Array[String]): Unit = {
    val course = new Course
    course.addEntry("Emre Uludag")
    course.addEntry("Aylin Akseki")
    println(course.printContent())
    val p = new Persistence
    val filename = "/Users/emreuludag/Desktop/design-patterns-scala/src/main/scala/com/solid/srp/journal.txt"
    p.saveToFile(course, filename, true)
  }
}
