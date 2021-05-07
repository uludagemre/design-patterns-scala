package com.composite

import java.util

class BankManager(id: Int, name: String, salary: Double) extends Employee {

  private val managerId : Int = id
  private val managerName : String = name
  private val managerSalary : Double = salary

  val employees = new util.ArrayList[Employee]()

  override def getId: Int = this.managerId

  override def getName: String = managerName

  override def getSalary: Double = managerSalary

  override def print(): Unit = {
    println("==========================")
    println("Id ="+getId)
    println("Name ="+getName)
    println("Salary ="+getSalary)
    println("==========================")

    val it = employees.iterator();

    while(it.hasNext)  {
      val employee = it.next();
      employee.print();
    }
  }

  override def add(employee: Employee): Unit = employees.add(employee)

  override def remove(employee: Employee): Unit = employees.remove(employee)

  override def getChild(i: Int): Employee = employees.get(i)
}