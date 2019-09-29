package com.designpattern.observer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:05 2019/9/29
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
// 气象局的公告板
class CurrentConditions extends Observer {
  private var mTemperature:Float = _
  private var mPressure:Float = _
  private var mHumidity:Float = _

  def display(): Unit ={
    println("***气象局的天气公告板 Today mTemperature: " + mTemperature + "***")
    println("***气象局的天气公告板 Today mPressure: " + mPressure + "***")
    println("***气象局的天气公告板 Today mHumidity: " + mHumidity + "***")
  }
  override def update(mTemperature: Float, mPressure: Float, mHumidity: Float): Unit = {
    // 更新天气公告板
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity

    // 显示
    display()
  }

}
