package com.fsnip.mymatch

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:47 2019/9/9
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object MatchObject {
  def main(args: Array[String]): Unit = {
    val number = Square(5.0) // 默认调用apply方法，返回25.0
    number match {
      // 当匹配到case Square(n)时，默认调用unapply(z: Double)方法, z的值就是number
      case Square(n) => println("匹配成功 n = " + n)
      case _ => println("nothing matched")
    }
  }
}
object Square{
  // unapply方法是对象提取器
  def unapply(z: Double): Option[Double] = {
    println("unapply方法被调用, z = " + z )
    Some(math.sqrt(z))
  }
  def apply(z: Double): Double = z * z
}