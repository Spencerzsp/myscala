package com.designpattern.abstractfactory.pizzastore.order

import com.designpattern.abstractfactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:13 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */

// 这里我们将OrderPizza做成抽象类
class OrderPizza {

  var absFactory: AbsFactory = _

  def this(absFactory: AbsFactory) {
    this
    breakable {
      var orderType: String = null
      var pizza: Pizza = null
      do {
        println("请输入pizza的类型 使用了抽象工厂模式")
        orderType = StdIn.readLine()
        pizza = absFactory.createPizza(orderType)
        if (pizza == null)
          break()
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
      } while (true)
    }
  }
}
