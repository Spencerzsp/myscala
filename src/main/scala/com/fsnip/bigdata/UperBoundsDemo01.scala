package com.fsnip.bigdata

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:44 2019/8/13
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object UperBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    val compareInt = new CompareInt(10, 20)
    println(compareInt.greater)

    val commonCompare1 = new CommonCompare[Integer](20, 30)
    println(commonCompare1.greater)

    val commonCompare2 = new CommonCompare[java.lang.Float](2.1f, 3.1f)
    println(commonCompare2.greater)
  }
}

//传统方法
class CompareInt(n1: Int, n2: Int){
  def greater = if(n1 > n2) n1 else n2
}

//[T <: Comparable[T]]表示T类型是Comparable的子类型
class CommonCompare[T <: Comparable[T]](obj1: T, obj2: T){
  def greater = if(obj1.compareTo(obj2) > 0) obj1 else obj2
}
