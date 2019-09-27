package com.designpattern.decorator.coffebar.mydecorator

import com.designpattern.decorator.coffebar.Drink

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:31 2019/9/27
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class Chocolate(obj: Drink) extends Decorator(obj){

  super.setDescription("Chocolate")
  super.setPrice(3.0f)

}
