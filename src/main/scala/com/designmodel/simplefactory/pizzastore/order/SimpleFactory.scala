package com.designmodel.simplefactory.pizzastore.order

import com.designmodel.simplefactory.pizzastore.pizza.{CheesePizza, GreekPizza, PepperPizza, Pizza}

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:25 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object SimpleFactory {

  def createPizza(t: String): Pizza ={
    var pizza: Pizza = null
    if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if (t.equals("pepper")) {
      pizza = new PepperPizza
    } else if(t.equals("cheese")){
      pizza = new CheesePizza
    }
    return pizza
  }
}
