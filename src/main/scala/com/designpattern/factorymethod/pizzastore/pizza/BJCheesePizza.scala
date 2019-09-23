package com.designpattern.factorymethod.pizzastore.pizza

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:43 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class BJCheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京奶酪pizza"
    println(this.name + " preparing")
  }
}
