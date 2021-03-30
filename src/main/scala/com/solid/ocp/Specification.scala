package com.solid.ocp

trait Specification[T] {
  def isSatisfied(item: T): Boolean
}
