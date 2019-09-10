package com.fsnip.myimplicit

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:38 2019/8/21
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object ImplicitDemo04 {
  def main(args: Array[String]): Unit = {

    implicit class DB(val m: Mysql2){
      def addSuffix(): String ={
        m + "scala"
      }
    }

    val mysql = new Mysql2
    mysql.sayOk()
    mysql.addSuffix()
  }
}

class Mysql2{
  def sayOk(): Unit ={
    println("say ok")
  }
}
