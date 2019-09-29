package com.designpattern.observer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:26 2019/9/29
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object InternetWeather {
  def main(args: Array[String]): Unit = {
    val conditions = new CurrentConditions()

    val dataSubject = new WeatherDataSubject

    dataSubject.registerObserver(conditions)

    val conditions1 = new SinaCurrentConditions
    dataSubject.registerObserver(conditions1)
    dataSubject.setData(30, 150, 40)
  }
}
