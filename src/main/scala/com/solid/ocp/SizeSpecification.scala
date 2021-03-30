package com.solid.ocp

import com.solid.ocp.Size.Size

class SizeSpecification(size: Size) extends Specification[Product] {
  override def isSatisfied(product: Product): Boolean = {
    product.size == size
  }
}
