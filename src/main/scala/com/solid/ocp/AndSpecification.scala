package com.solid.ocp

class AndSpecification[T](first: Specification[T], second: Specification[T]) extends Specification[T] {
  override def isSatisfied(item: T): Boolean = {
    first.isSatisfied(item) && second.isSatisfied(item)
  }
}
