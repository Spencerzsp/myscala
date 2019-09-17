package com.fsnip.customercrm.view

import com.fsnip.customercrm.bean.Customer
import com.fsnip.customercrm.service.CustomerService

import scala.io.StdIn

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:05 2019/9/12
  * @ Description：
  * @ Modified By：
  * @ Version:
  *
  *     * 主界面
  * --------------------------客户信息管理软件-----------------------
  *
  *                             1 添加客户
  *                             2 修改客户
  *                             3 删除客户
  *                             4 客户列表
  *                             5 退   出
  *
  *                             请选择(1-5): _
  */
class CustomerView {
  var flag = true
  var k = 0

  private val customerService = new CustomerService()
  def mainMenu(): Unit ={
    do{
      println()
      println()
      println("---------------------------客户信息管理软件-----------------------")
      println("                            1 添加客户")
      println("                            2 修改客户")
      println("                            3 删除客户")
      println("                            4 客户列表")
      println("                            5 退   出")
      println("                            请选择(1-5): _")

      k = StdIn.readInt()
      k match {
        case 1 => this.add()
        case 2 => this.update()
        case 3 => this.del()
        case 4 => this.list()
        case 5 => this.flag = false
        case _ => println("输入错误,请重新输入！")
      }

    }while(flag)
    println("你退出了软件系统...")
  }

  /**
    * ----------------------------客户列表------------------------------
    *  编号		姓名		性别		年龄		电话		邮箱
    *  1		  tom		 男		10		110		tom@sohu.com
    *  2		zhangsan 男		20		119		zhangsan@123.com
    *  ----------------------------客户列表完成----------------------------
    *
    */
  def list(): Unit ={
    println()
    println("----------------------------客户列表------------------------------")
    println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
    val customers = customerService.list()
    for(customer <- customers){
      //重写Customer的toString方法
      println(customer)
    }

    println("----------------------------客户列表完成----------------------------")

  }

  /**
    *  添加客户界面
    * ---------------------------添加客户------------------------------
    * 姓名： 张三
    * 性别： 男
    * 年龄： 30
    * 电话： 028-123456
    * 邮箱： zhang@abc.com
    * ---------------------------添加完成-------------------------------
    */
  def add(): Unit ={
    println("---------------------------添加客户------------------------------")
    println("姓名： ")
    val name = StdIn.readLine()
    println("性别： ")
    val gender = StdIn.readChar()
    println("年龄： ")
    val age = StdIn.readShort()
    println("电话： ")
    val tel = StdIn.readLine()
    println("邮箱： ")
    val email = StdIn.readLine()

    // 构建对象customer，缺少id，重写一个辅助构造器
    val customer = new Customer(name, gender, age, tel, email)
    customerService.add(customer)

  }

  /**
    * 删除客户界面
    * ----------------------------删除客户------------------------------
    * 请选择待删除客户编号(-1退出)：1
    * 确认术后删除(Y/N): y
    * ----------------------------删除完成------------------------------
    */
  def del(): Unit ={
    println("----------------------------删除客户------------------------------")
    println("请选择待删除客户编号(-1退出)：")
    val id = StdIn.readInt()
    if(id == -1){
      println("----------------------------删除没有完成------------------------------")
      return
    }
    println("确认术后删除(Y/N): ")
    val choice = StdIn.readChar().toLower
    if(choice == 'y'){
      if(customerService.del(id)) {
        println("----------------------------删除完成------------------------------")
        return
      }
    }
    println("----------------------------删除没有完成------------------------------")
  }

  /**
    * 修改客户界面
    * ---------------------------修改客户-------------------------------
    * 请选择待修改客户编号(-1退出)：
    * 姓名(张三)：<直接回车表示不修改>
    * 性别(男):
    * 年龄30):
    * 电话(028-123456):
    * 邮箱(zhang@qbc.com)；
    * ---------------------------修改完成-------------------------------
    */

  def update(): Unit ={
    println("---------------------------修改客户-------------------------------")
    println("请选择待修改客户编号(-1退出)：")
    val id = StdIn.readInt()
    if(id == -1){
      println("---------------------------修改没有完成-------------------------------")
      return
    }else{
      if (customerService.update(id)){

        println("---------------------------修改完成-------------------------------")
        return
      }else{
        println("---------------------------修改没有完成-------------------------------")
      }
    }

  }
}
