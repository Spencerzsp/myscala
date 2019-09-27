package com.designpattern.decorator.coffebar.mydecorator

import com.designpattern.decorator.coffebar.Drink

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:25 2019/9/27
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
// 这个就是装饰者
class Decorator extends Drink{

  private var obj: Drink = null

  def this(obj: Drink){
    this
    this.obj = obj
  }

  override def getDescription(): String = {
    super.getDescription() + "&&" + obj.getDescription()
  }
  override def cost() = {
    super.getPrice() + obj.cost()
  }

}
