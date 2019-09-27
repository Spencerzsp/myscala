package com.designpattern.decorator.coffebar.mydecorator

import com.designpattern.decorator.coffebar.Drink
import com.designpattern.decorator.coffebar.mycoffee.{Espresso, LongBlack}

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:39 2019/9/27
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object CoffeeBar {
  def main(args: Array[String]): Unit = {
    val chocolate = new Chocolate(new Espresso)

    println("chocolate desc: " + chocolate.getDescription())
    println("chocolate price:" + chocolate.cost())

    var order: Drink = new LongBlack
    order = new Milk(order)
    order = new Chocolate(order)
    order = new Soy((order))

    println("order desc: " + order.getDescription())
    println("order price:" + order.cost())
  }
}
