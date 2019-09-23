package com.designmodel.simplefactory.pizzastore.order

import com.designmodel.simplefactory.pizzastore.pizza.{GreekPizza, PepperPizza, Pizza}

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:13 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class OrderPizza {

  var orderType: String = _
  var pizza: Pizza = _
  breakable {
    do {
      println("请输入pizza的类型 使用了简单工厂模式")
      orderType = StdIn.readLine()
      pizza = SimpleFactory.createPizza(orderType)
      if(pizza == null)
        break()
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }
}
