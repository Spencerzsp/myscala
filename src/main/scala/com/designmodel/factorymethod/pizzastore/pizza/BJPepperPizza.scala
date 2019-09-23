package com.designmodel.factorymethod.pizzastore.pizza

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:44 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class BJPepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京胡椒pizza"
    println(this.name + " preparing")
  }
}
