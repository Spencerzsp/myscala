package com.designpattern.abstractfactory.pizzastore.pizza

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:11 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + "preparing")
  }
}
