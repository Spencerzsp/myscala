package com.designpattern.decorator.coffebar.mycoffee

import com.designpattern.decorator.coffebar.Drink

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:17 2019/9/27
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
// 在Drink和单品coffe之间做了一个缓存层，用来扩展以后其它非咖啡的饮品
class Coffee extends Drink{
  override def cost(): Float = {
    super.getPrice()
  }
}
