package com.fsnip.mymap

import scala.collection.mutable

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:42 2019/8/27
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object MapDemo01 {
  def main(args: Array[String]): Unit = {

    // 二元组方式创建map
    val map = mutable.Map(("Alice", 10), ("Bob", 20), ("Kotlin", 30))
    println(map)

    //使用map.get(key).get取值
    //1.如果key存在，map.get(key)就会返回Some(值)，然后Some(值).get就可以取出值
    //2.如果key不存在，map.get(key)就会返回None
    println(map.get("Alice"))     //Some(10)
    println(map.get("Alice").get) //10

    //使用map.getOrElse()取值
    println(map.getOrElse("Alice", "默认的鱼<・)))><<"))
    println(map.getOrElse("Alice~~~~", "默认的鱼<・)))><<"))

    val map2 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    for((k, v) <- map2)
      println(k, v)
    for(k <- map2.keys)
      println(k)
    for(v <- map2.values)
      println(v)
    for(x <- map2)
      println(x + "key:" + x._1 + "\t" + "value:" + x._2)
  }

}
