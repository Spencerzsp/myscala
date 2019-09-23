package com.designpattern.abstractfactory.pizzastore.order

import com.designpattern.abstractfactory.pizzastore.pizza.Pizza

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:54 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
trait AbsFactory {

  def createPizza(t: String): Pizza
}
