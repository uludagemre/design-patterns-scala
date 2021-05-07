package com.composite

class Cashier(id: Int, name: String, salary: Double) extends Employee {

  private val cashierId : Int = id
  private val cashierName : String = name
  private val cashierSalary : Double = salary

  override def getId: Int = this.cashierId

  override def getName: String = this.cashierName

  override def getSalary: Double = this.cashierSalary

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
