package com.solid.ocp

trait Filter[T] {
  def filter(items: List[T], specification: Specification[T]): List[T]
}
