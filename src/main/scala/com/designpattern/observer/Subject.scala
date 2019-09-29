package com.designpattern.observer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:52 2019/9/29
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
trait Subject {
  // 注册
  def registerObserver(o: Observer)
  // 移除
  def removeObserver(o:Observer)
  // 通知
  def notifyObserver()
}
