package com.fsnip.mytrait

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:36 2019/8/19
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object TraitDemo01 {
  def main(args: Array[String]): Unit = {
    val b = new B()
    val e = new E()
    b.getConnect()
    e.getConnect()
  }
}
trait Trait01{
  def getConnect()
}
class A {}
class B extends A with Trait01 {
  override def getConnect(): Unit = {
    println("连接mysql")
  }
}
class C extends A {}
class D {}
class E extends D with Trait01 {
  override def getConnect(): Unit = {
    println("连接oracle")
  }
}
class F extends D {}