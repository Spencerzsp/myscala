package com.fsnip.recursive

import java.text.SimpleDateFormat
import java.util.Date

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:50 2019/9/11
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
    val now = new Date()
    val dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前的时间date = " + date)

    var result = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999l)
    while (num < maxVal){
      result += num
      num += 1
    }
    println("result = " + result)

    val now2 = new Date()
    val date2 = dateFormat.format(now2)
    println("执行完毕的时间date2 = " + date2)
  }
}
