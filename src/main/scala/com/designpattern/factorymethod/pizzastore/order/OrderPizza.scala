package com.designpattern.factorymethod.pizzastore.order

import com.designpattern.factorymethod.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:13 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */

// 这里我们将OrderPizza做成抽象类,自己就相当于是一个工厂
abstract class OrderPizza {

  def createPizza(orderType: String): Pizza

  breakable {
    var orderType: String = null
    var pizza: Pizza = null
    do {
      println("请输入pizza的类型 使用了工厂方法模式")
      orderType = StdIn.readLine()
      pizza = createPizza(orderType)
      if(pizza == null)
        break()
      pizza.prepare()
      pizza.bake()
      pizza.cut()
      pizza.box()
    } while (true)
  }
}
