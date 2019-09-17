package com.fsnip.customercrm.bean

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:59 2019/9/12
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class Customer {
  /**
    * 主界面
    * --------------------------客户信息管理软件-----------------------
    *
    *                             1 添加客户
    *                             2 修改客户
    *                             3 删除客户
    *                             4 客户列表
    *                             5 退   出
    *
    *                             请选择(1-5): _
    *
    * 添加客户界面
    * ---------------------------添加客户------------------------------
    * 姓名： 张三
    * 性别： 男
    * 年龄： 30
    * 电话： 028-123456
    * 邮箱： zhang@abc.com
    * ---------------------------添加完成-------------------------------
    *
    * 修改客户界面
    * ---------------------------修改客户-------------------------------
    * 请选择待修改客户编号(-1退出)：
    * 姓名(张三)：<直接回车表示不修改>
    * 性别(男):
    * 年龄30):
    * 电话(028-123456):
    * 邮箱(zhang@qbc.com)；
    * ---------------------------修改完成-------------------------------
    *
    * 删除客户界面
    * ----------------------------删除客户------------------------------
    * 请选择待删除客户编号(-1退出)：1
    * 确认术后删除(Y/N): y
    * ----------------------------删除完成------------------------------
    *
    * 客户列表界面
    * 请选择(1-5):4
    * ----------------------------客户列表------------------------------
    *
    * ----------------------------客户列表完成----------------------------
    *
    */
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var tel: String = _
  var email: String = _



  def this( name: String, gender: Char, age: Short, tel: String, email: String){
    this
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }

  def this(id: Int, name: String, gender: Char, age: Short, tel: String, email: String){
    this
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }

  override def toString: String = {
    this.id + "\t\t" + this.name + "\t\t" + this.gender+ "\t\t" + this.age + "\t\t" + this.tel + "\t\t" + this.email
  }
}
