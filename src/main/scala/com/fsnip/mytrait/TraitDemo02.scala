package com.fsnip.mytrait

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:54 2019/8/19
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object TraitDemo02 {
  def main(args: Array[String]): Unit = {

  }
}

trait Trait02{
  def sayHi()
  def sayHello(): Unit ={
    println("say hello")
  }
}

class Sheep extends Trait02{
  override def sayHi(): Unit = {
    println("小羊say hi ~~~~~~")
  }
}