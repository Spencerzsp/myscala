package com.fsnip.abstractdemo

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:57 2019/8/16
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object BankDemo {
  def main(args: Array[String]): Unit = {
    val account = new Account("工行0001", 1000.0, "111111")
    account.query("111111")
    account.withDraw("111111", 2000.0)
    account.query("111111")



  }
}

class Account(inAccount: String, inBalance: Double, inPwd: String){
  val account = inAccount
  private var balance = inBalance
  var pwd = inPwd

  def query(pwd: String): Unit ={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }
    printf("账号为%s,当前余额是%2f\n", this.account, this.balance)
  }

  def withDraw(pwd: String, money: Double): Any ={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }

    if(this.balance < money){
      println("余额不足")
      return
    }
    this.balance -= money
    money
  }

}
