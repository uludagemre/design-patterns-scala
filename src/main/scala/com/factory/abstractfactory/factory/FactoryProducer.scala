package com.factory.abstractfactory.factory

object FactoryProducer {
  def getFactory(choice: String): AbstractFactory = {
    if (choice.equalsIgnoreCase("shape")) {
      return new ShapeFactory()
    } else if (choice.equalsIgnoreCase("color")) {
      return new ColorFactory()
    }

    null
  }
}
