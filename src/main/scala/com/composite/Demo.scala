package com.composite

object Demo {
  def main(args: Array[String]): Unit = {
    val manager = new BankManager(17, "Brooks Adams", 57000.0)
    val emp1 = new Cashier(101, "Sohan Kumar", 20000.0)
    val emp2 = new Cashier(102, "Mohan Kumar", 25000.0)
    val emp3 = new Accountant(105, "Saeid Kasri", 27000.0)

    manager.add(emp1)
    manager.add(emp2)
    manager.add(emp3)

    val numberOfEmployees = manager.employees.size()
    for (a <- 0 until numberOfEmployees){
     manager.getChild(a).print()
    }
  }
}
