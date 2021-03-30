package com.solid.ocp

object EnhancedFilter extends Filter[Product] {
  override def filter(items: List[Product], specification: Specification[Product]): List[Product] = {
    items.filter(specification.isSatisfied)
  }
}
