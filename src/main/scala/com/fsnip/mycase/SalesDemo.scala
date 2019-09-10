package com.fsnip.mycase

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:25 2019/9/9
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object SalesDemo {
  def main(args: Array[String]): Unit = {
    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))
    val result = sale match {
      case Bundle(_, _, Book(desc, _), _*) => desc
    }
    println("result = "+result)

    val result2 = sale match {
      // 通过@将嵌套的值绑定到变量
      case Bundle(_, _, art @ Book(_, _), rest @ _*) => (art, rest)
    }
    println(result2)
    println("art = " + result2._1)
    println("rest = " + result2._2)

    println("price = " + price(sale))

    def price(item: Item): Double ={
      item match {
        case Book(_, p) => p
        case Bundle(_, disc, its @ _*) => {
          println("price被调用~~~~~~~~")
          // 递归调用price方法
          its.map(price).sum - disc
        }
      }
    }
  }
}
// 设计样例类
abstract sealed class Item
case class Book(desc: String, price: Double) extends Item
case class Bundle(desc: String, discount: Double, item: Item*) extends Item