package com.fsnip.mix

import com.fsnip.mytrait.TraitDemo01

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:23 2019/8/20
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object DynamicMixTrait {
  def main(args: Array[String]): Unit = {
    val oracle = new TraitOracle() with Trait01 //动态混入特质
    oracle.insert(100)

    val mysql = new TraitMysql() with Trait01
    mysql.insert(200)

    //    如果一个抽象类有抽象方法时，动态混入特质如下，方法的实现必须跟在trait之后
    val mysql1 = new TraitMysql_() with Trait01 {
      override def say(): Unit = {
        println("say")
      }
    }
    mysql1.insert(300)
    mysql1.say()
  }
}

trait Trait01 {
  def insert(n: Int): Unit = {
    println("插入的数据=" + n)
  }
}

class TraitOracle {
//  def apply: TraitOracle = new TraitOracle() apply方法创建对象
}

abstract class TraitMysql {}

abstract class TraitMysql_ {
  def say()
}
