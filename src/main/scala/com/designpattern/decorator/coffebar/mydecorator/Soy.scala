package com.designpattern.decorator.coffebar.mydecorator

import com.designpattern.decorator.coffebar.Drink

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:37 2019/9/27
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class Soy(obj: Drink) extends Decorator(obj) {

    setDescription("Soy")
    setPrice(3.0f)

}
