package com.factory.abstractfactory.factory

import com.factory.abstractfactory.color.Color
import com.factory.abstractfactory.shape.{Circle, Rectangle, Shape, Square}

class ShapeFactory extends AbstractFactory {
  override def getColor(name: String): Color = null

  override def getShape(name: String): Shape = {
    if (name.equalsIgnoreCase("circle")) {
      return new Circle()
    } else if (name.equalsIgnoreCase("rectangle")) {
      return new Rectangle()
    } else if (name.equalsIgnoreCase("square")) {
      return new Square()
    }

    null
  }
}
