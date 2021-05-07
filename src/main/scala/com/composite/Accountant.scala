package com.composite

class Accountant(id: Int, name: String, salary: Double) extends Employee {

  private val accountantId : Int = id
  private val accountantName : String = name
  private val accountantSalary : Double = salary

  override def getId: Int = this.accountantId

  override def getName: String = this.accountantName

  override def getSalary: Double = this.accountantSalary

  override def print(): Unit = {
    println("==========================")
    println("Id ="+getId)
    println("Name ="+getName)
    println("Salary ="+getSalary)
    println("==========================")
  }

  override def add(employee: Employee): Unit = ???

  override def remove(employee: Employee): Unit = ???

  override def getChild(i: Int): Employee = ???
}
