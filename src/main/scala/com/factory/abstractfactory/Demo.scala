package com.factory.abstractfactory

import com.factory.abstractfactory.factory.{ColorFactory, FactoryProducer, ShapeFactory}

object Demo {
  def main(args: Array[String]): Unit = {
    val shapeFactory = FactoryProducer.getFactory("shape").asInstanceOf[ShapeFactory]
    val shape = shapeFactory.getShape("square")

    shape.draw()

    val colorFactory = FactoryProducer.getFactory("color").asInstanceOf[ColorFactory]
    val color = colorFactory.getColor("red")

    color.fill()
  }
}

