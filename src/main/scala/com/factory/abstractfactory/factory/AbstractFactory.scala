package com.factory.abstractfactory.factory

import com.factory.abstractfactory.color.Color
import com.factory.abstractfactory.shape.Shape

abstract class AbstractFactory {
  def getColor(name: String): Color
  def getShape(name: String): Shape
}
