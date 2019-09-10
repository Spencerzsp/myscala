package com.fsnip.myimplicit

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:07 2019/8/21
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {

    implicit def f1(mysql: Mysql): DB ={
      new DB
    }
    val mysql = new Mysql
    mysql.insert()
    mysql.delete()


  }
}

class Mysql{
  def insert(): Unit ={
    println("insert")
  }
}

class DB{
  def delete(): Unit ={
    println("delete")
  }
}
