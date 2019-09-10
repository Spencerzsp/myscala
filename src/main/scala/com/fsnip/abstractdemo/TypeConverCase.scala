package com.fsnip.abstractdemo

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:19 2019/8/16
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object TypeConverCase {
  def main(args: Array[String]): Unit = {
    val stu = new Student
    val emp = new Emp
    test(stu)
    test(emp)


  }

  def test(p : Person): Unit ={
    if(p.isInstanceOf[Emp]){
      p.asInstanceOf[Emp].cry()
    }else if(p.isInstanceOf[Student]){
      p.asInstanceOf[Student].cry()
    }else{
      println("转换失败")
    }
  }
}

class Person{
  def printName(): Unit ={
    println("Person printName")
  }

  def sayOk(): Unit ={
    println("Person sayOk")
  }
}

class Emp extends Person{
  val empId = 100

  override def printName(): Unit = {
    println("Emp printName")
  }

  def cry(): Unit ={
    println("empId=" + empId)
  }
}

class Student extends Person{
  val stuId = 200

  override def printName(): Unit = {
    println("Student printName")
  }

  def cry(): Unit ={
    println("stuId=" + stuId)
  }
}
