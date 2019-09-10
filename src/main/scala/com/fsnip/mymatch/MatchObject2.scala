package com.fsnip.mymatch

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:34 2019/9/9
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object MatchObject2 {
  def main(args: Array[String]): Unit = {
    val names = "Alice, Bill, Tom"
    names match {
      case Names(first, second, last) => println(s"$first, $second, $last")
      case _ => println(" nothing matched")
    }
  }
}
object  Names{
  def unapplySeq(str: String): Option[Seq[String]] = {
    if(str.contains(",")) Some(str.split(","))
    else None
  }
}
