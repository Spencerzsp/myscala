package com.fsnip.test

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:14 2019/9/20
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object GetOrElseDemo {
  def main(args: Array[String]): Unit = {
    val lists = List(Some(1), Some(2), None, Some(3))
    println(mySum(lists))
  }

  // getOrElse(0),Option中有值就返回，为None就返回0
  def mySum(list: List[Option[Int]]) = list.map(_.getOrElse(0)).sum
}
