package com.designmodel.abstractfactory.pizzastore.pizza

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:06 2019/9/23
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
abstract class Pizza {

  var name: String = _

  // 假定每种pizza准备的原材料不同，因此做成抽象的方法
  def prepare()
  def cut(): Unit ={
    println(this.name + " cutting ..")
  }
  def bake(): Unit ={
    println(this.name + " bakeing ..")
  }
  def box(): Unit ={
    println(this.name + " box ..")
  }
}
