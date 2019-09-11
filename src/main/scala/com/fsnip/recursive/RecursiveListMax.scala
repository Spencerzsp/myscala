package com.fsnip.recursive

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:26 2019/9/11
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object RecursiveListMax {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,100,30,20)
    println(listMax(list))
  }

  def listMax(list: List[Int]): Int ={
    if (list.isEmpty){
      throw new java.util.NoSuchElementException()
    }
    if(list.size == 1){
      list.head
    }else if(list.head > listMax(list.tail)){
      list.head
    }else{
      listMax(list.tail)
    }
  }
}
