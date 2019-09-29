package com.designpattern.observer

import scala.collection.mutable.ListBuffer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:16 2019/9/29
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class WeatherDataSubject extends Subject {
  private var mTemperature: Float = _
  private var mPressure: Float = _
  private var mHumidity: Float = _
  // 集合，用于管理所有的观察者
  private val mObserver: ListBuffer[Observer] = ListBuffer()

  def getTemperature() = {
    mTemperature
  }

  def getPressure() = {
    mPressure
  }

  def getHumidity() = {
    mHumidity
  }

  def dataChange() = {
    notifyObserver()
  }

  def setData(mTemperature: Float, mPressure: Float, mHumidity: Float) = {
    this.mTemperature = mTemperature
    this.mPressure = mPressure
    this.mHumidity = mHumidity

    dataChange()
  }

  override def registerObserver(o: Observer): Unit = {
    mObserver.append(o)
  }

  override def removeObserver(o: Observer): Unit = {
    if(mObserver.contains(o))
      mObserver -= o
  }

  override def notifyObserver(): Unit = {
    for (observer <- mObserver){
      observer.update(mTemperature, mPressure, mHumidity)
    }
  }
}
