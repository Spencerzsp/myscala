package com.fsnip.bigdata

import scala.beans.BeanProperty


/**
  * @ Author     ：zsp
  * @ Date       ：Created in 10:40 2019/8/14
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object TestDog {
  def main(args: Array[String]): Unit = {
    val dog = new Dog()
    dog.name = "tomdog"
    dog.age = 1
    dog.weight = 2
    println(dog.say())

    val person = new Person("tom", 20)
    println(person)

    val work = new Work()
    work.setName("IT")
    println(work.getName)
  }
}

class Dog{
  var name = ""
  var age = 0
  var weight = 0.0

  def say(): String ={
    "小狗的信息如下:" + this.name + "\t" + this.age + "\t" + this.weight
  }

  override def toString: String = super.toString
}

class Person (inName: String, inAge: Int){
  var name = inName
  var age = inAge

  def this(name: String){
    this("jack", 10) //直接调用主构造器
    this.name = name
  }

  def this(age: Int){
    this("tom") //间接调用主构造器
    this.age = age
  }

  override def toString: String = {
    "name=" + this.name + "\t" + "age="+ this.age
  }
}

class Work(){
  @BeanProperty var name: String = ""
}
