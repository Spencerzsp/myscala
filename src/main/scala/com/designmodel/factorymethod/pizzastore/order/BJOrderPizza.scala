package com.designmodel.factorymethod.pizzastore.order

import com.designmodel.factorymethod.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:48 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class BJOrderPizza extends OrderPizza {
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
