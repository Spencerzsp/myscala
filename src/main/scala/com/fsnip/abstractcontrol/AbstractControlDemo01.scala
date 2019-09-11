package com.fsnip.abstractcontrol

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:04 2019/9/11
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object AbstractControlDemo01 {
  def main(args: Array[String]): Unit = {
    def myRunInThread(f1: () => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }

    myRunInThread {
      () =>
        println("干活咯！5秒完成---")
        Thread.sleep(5000)
        println("干完咯！")
    }

    def myRunInThread2(f1: => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }

    // 对于没有输入，也没有返回值的函数，可以简写成如下形式
    myRunInThread2 {
      println("干活咯！5秒完成~~~")
      Thread.sleep(1000)
      println("第1秒完成进度")
      Thread.sleep(1000)
      println("第2秒完成进度")
      Thread.sleep(1000)
      println("第3秒完成进度")
      Thread.sleep(1000)
      println("第4秒完成进度")
      Thread.sleep(1000)
      println("第5秒完成进度")
      println("干完咯！")
    }
  }
}
