package com.fsnip.mycase

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:20 2019/9/9
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
//    println("hello")
    for(amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"),NoAmount)){
      val result = amt match {
        case Dollar(v) => v
        case Currency(u, v) => u + " " + v
        case NoAmount => ""
      }
      println(amt + ":" + result)
    }
  }
}

abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount
case object NoAmount extends Amount
