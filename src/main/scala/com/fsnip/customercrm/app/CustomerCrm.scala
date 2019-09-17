package com.fsnip.customercrm.app

import com.fsnip.customercrm.view.CustomerView

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:24 2019/9/17
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }
}
