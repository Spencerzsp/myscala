package com.fsnip.mytuple

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:28 2019/8/26
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    val tuple1 = (1,2,3,"hello",4)
//    遍历元组
    for(iter <- tuple1.productIterator){
      println(iter)
    }

    val list = List[Any](1,2,3,"hello")
    val list2 = list :+ 4
    val list3 = 4 +: list
//    println(list)
//    println(list2)
//    println(list3)

    val list4 = 5::6::7::list::Nil
    println(list4)
    val list5 = 5::6::7::list:::Nil
//    println((list5))

    val list6 = ListBuffer[Int](1, 2, 3)
    val list7 = new ListBuffer[Int]
    list7 += 4
    list7.append(5)

    list6 ++= list7
//    println(list6)

    val queue = new mutable.Queue[Int]()
    queue.enqueue(1,2,3)
    println(queue)
    queue.dequeue()
    println(queue)
  }
}
