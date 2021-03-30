package com.factory.abstractfactory.factory

import com.factory.abstractfactory.color.{Blue, Color, Green, Red}
import com.factory.abstractfactory.shape.Shape

class ColorFactory extends AbstractFactory {

  override def getColor(name: String): Color = {
    if (name.equalsIgnoreCase("red")) {
      return new Red()
    } else if (name.equalsIgnoreCase("green")) {
      return new Green()
    } else if (name.equalsIgnoreCase("blue")) {
      return new Blue()
    }

    null
  }

  override def getShape(name: String): Shape = null
}
