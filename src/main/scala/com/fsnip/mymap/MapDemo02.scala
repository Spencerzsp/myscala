package com.fsnip.mymap

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:55 2019/8/28
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object MapDemo02 {
  def multiple(n: Int): Int = {
    n * 2
  }
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    // 说明list.map(multiple)做了什么
    // 1.将list这个集合的元素一次遍历
    // 2.将各个元素传递给multiple，得到新的Int
    // 3.将得到的新Int，放入到一个新的集合并返回
    // 4.因此multiple函数调用3次，因为list中有三个元素
    val list2 = list.map(multiple)
    println(list2)

    val list3 = MyList()  //通过MyList伴生对象中的apply方法得到list对象
    val myList3 = list3.map(multiple)
    println(myList3)
  }
}

//深刻理解map映射函数的机制-模拟实现
class MyList{
  val list = List(1, 2, 3)
  var list2 = List[Int]()
  def map(f: Int => Int): List[Int] ={
    for(item <- this.list){
      list2 = list2 :+ f(item)
    }
    list2
  }
}

object MyList{
  def apply(): MyList = new MyList()  //apply方法后面最好加上()
}
