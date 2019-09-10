package com.fsnip.myimplicit

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:15 2019/8/21
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object ImplicitDemo03 {
  def main(args: Array[String]): Unit = {

    implicit val str1: String = "jack"  //这个就是隐式值

//    implicit name,其中name就是隐式参数
    def hello(implicit name: String): Unit ={
      println(name + " hello")
    }
    hello //不要带()
  }
}
