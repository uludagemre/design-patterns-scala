package com.solid.ocp

object Demo {
  def main(args: Array[String]): Unit = {
    val apple: Product = new Product("Apple", Color.GREEN, Size.SMALL)
    val tree: Product = new Product("Tree", Color.GREEN, Size.LARGE)
    val house: Product = new Product("House", Color.BLUE, Size.LARGE)

    val products: List[Product] = List(apple, tree, house)

    //Bad way of filtering colors.
    println("Green products (old):")
    ProductFilter.filterByColor(products, Color.GREEN)
      .foreach((p: Product) => println(" - " + p.name + " is green"))

    //Good way of filtering colors.
    println("Green products (new):")
    EnhancedFilter.filter(products, new ColorSpecification(Color.GREEN))
      .foreach((p: Product) => println(" - " + p.name + " is green"))

  }
}
