package com.designpattern.decorator.coffebar.mydecorator

import com.designpattern.decorator.coffebar.Drink

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:36 2019/9/27
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class Milk(obj: Drink) extends Decorator(obj) {
    setDescription("Milk")
    setPrice(2.0f)

}
