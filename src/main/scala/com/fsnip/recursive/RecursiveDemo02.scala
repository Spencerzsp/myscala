package com.fsnip.recursive

import java.text.SimpleDateFormat
import java.util.Date

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:00 2019/9/11
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {
    val now = new Date()
    val dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前的时间date = " + date)

    val sum = BigInt(0)
    val num = BigInt(1)
    val result = mx(num, sum)
    println("result = " + result)

    val now2 = new Date()
    val date2 = dateFormat.format(now2)
    println("执行完毕的时间date2 = " + date2)

  }

  def mx(number: BigInt, sum: BigInt): BigInt ={
    if(number < 99999999l) mx(number + 1, sum + number)
    else sum
  }
}
