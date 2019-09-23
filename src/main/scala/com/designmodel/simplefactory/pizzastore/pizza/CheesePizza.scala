package com.designmodel.simplefactory.pizzastore.pizza

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:28 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "奶酪pizza"
    println(this.name + " preparing")
  }
}
