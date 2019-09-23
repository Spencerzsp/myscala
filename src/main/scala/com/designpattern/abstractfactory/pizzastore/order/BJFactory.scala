package com.designpattern.abstractfactory.pizzastore.order

import com.designpattern.abstractfactory.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:55 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class BJFactory extends AbsFactory {
  override def createPizza(t: String):Pizza = {
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new BJCheesePizza
    } else if(t.equals("pepper")){
      pizza = new BJPepperPizza
    }
    return pizza
  }
}
