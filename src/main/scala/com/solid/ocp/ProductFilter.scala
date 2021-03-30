package com.solid.ocp

import com.solid.ocp.Color.Color
import com.solid.ocp.Size.Size

object ProductFilter {
  def filterBySize(products: List[Product], size: Size): List[Product] = {
    products.filter(_.size == size)
  }

  def filterByColor(products: List[Product], color: Color): List[Product] = {
    products.filter(_.color == color)
  }

  def filterByColorAndSize(products: List[Product], color: Color, size: Size): List[Product] = {
    products.filter(product => product.color == color && product.size == size)
  }
}
