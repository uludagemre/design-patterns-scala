package com.solid.ocp

import com.solid.ocp.Color.Color

class ColorSpecification(color: Color) extends Specification[Product] {
  override def isSatisfied(product: Product): Boolean = {
    product.color == color
  }
}
