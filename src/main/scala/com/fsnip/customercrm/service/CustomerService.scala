package com.fsnip.customercrm.service

import com.fsnip.customercrm.bean.Customer

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:05 2019/9/12
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
class CustomerService {

  var customerNumber = 1
  val customers = ArrayBuffer(new Customer(1, "tom", '男', 10, "110", "tom@sohu.com"))
  def list(): ArrayBuffer[Customer] ={
    this.customers
  }

  def add(customer: Customer): Boolean ={
    customerNumber += 1
    customer.id = customerNumber
    customers.append(customer)
    true
  }

  def del(id: Int): Boolean ={
    val index = findIndexById(id)
    if(index != -1){
      customers.remove(index)
      true
    }else{
      false
    }
  }
  def findIndexById(id: Int) ={
    var index = -1

    import util.control.Breaks._
    breakable{
      for(i <- 0 until customers.length){
        if(customers(i).id == id){
          index = i
          break
        }
      }
    }
    index

  }

  def update(id: Int): Boolean ={
    val index = findIndexById(id)
    if(index != -1){
      println("姓名"+"(" +customers(index).name + "):")
      val name = StdIn.readLine()
      println("性别"+"(" +customers(index).gender + "):")
      val gender = StdIn.readChar()
      println("年龄"+"(" +customers(index).age + "):")
      val age = StdIn.readShort()
      println("电话"+"(" +customers(index).tel + "):")
      val tel = StdIn.readLine()
      println("邮箱"+"(" +customers(index).email + "):")
      val email = StdIn.readLine()
      customers(index).name = name
      customers(index).gender = gender
      customers(index).age = age
      customers(index).tel = tel
      customers(index).email = email

      customers.update(index, customers(index))

      true
    }else{
      false
    }
  }

}
