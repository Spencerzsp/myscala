package com.designpattern.abstractfactory.pizzastore.pizza

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:09 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "希腊pizza"
    println(this.name + "preparing")
  }
}
