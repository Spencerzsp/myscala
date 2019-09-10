package com.fsnip.bigdata




/**
  * @ Author     ：zsp
  * @ Date       ：Created in 9:59 2019/8/15
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object ScalaPackage {

}

class User{
  import scala.beans.BeanProperty //在需要时才引入，作用域在{}
  @BeanProperty var name: String = ""

  def test(): Unit ={
//    可以使用选择器，选择引入包的内容，这里我们只引入HashMap,HashSet
    import scala.collection.mutable.{HashMap, HashSet}
    var map = new HashMap()
    var set = new HashSet()
  }

  def test2(): Unit ={
    //    将java.util.HashMap重命名为JavaHashMap
    import java.util.{HashMap => JavaHashMap, List}
    import scala.collection.mutable._
    var map = new HashMap() //指向scala中的HashMap
    var map1 = new JavaHashMap()  //指向java中的HashMap的别名
  }

  import java.util.{HashMap=>_, _} //引入java.util包的所有类，但是忽略HashMap类

}
