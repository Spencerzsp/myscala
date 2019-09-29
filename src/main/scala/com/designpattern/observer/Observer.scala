package com.designpattern.observer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:52 2019/9/29
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
trait Observer {

  // 抽象方法，等待其它第三方的观察者去实现
  def update(mTemperature: Float, mPressure: Float, mHumidity: Float)

}
