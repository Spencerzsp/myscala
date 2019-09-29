package com.designpattern.observer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:30 2019/9/29
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class SinaCurrentConditions extends Observer {
  private var mTemperature:Float = _
  private var mPressure:Float = _
  private var mHumidity:Float = _

  def display(): Unit ={
    if(mHumidity > 28){
      println("***新浪的天气公告板 Today mTemperature: " + mTemperature + "快离开地球***")
    } else if( mTemperature > 16 && mTemperature < 28){
      println("***新浪局的天气公告板 Today mPressure: " + mPressure + "赶紧回到地球***")
    }

    println("***新浪的天气公告板 Today mHumidity: " + mHumidity + "***")
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
