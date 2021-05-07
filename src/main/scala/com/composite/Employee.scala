package com.composite

trait Employee {
    def getId: Int
    def getName: String
    def getSalary: Double
    def print(): Unit
    def add(employee: Employee)
    def remove(employee: Employee)
    def getChild(i : Int): Employee
}
