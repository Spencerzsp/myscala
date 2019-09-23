package com.designmodel.abstractfactory.pizzastore.order

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:20 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object PizzaStore {
  def main(args: Array[String]): Unit = {
    new OrderPizza(new BJFactory)
  }
}
