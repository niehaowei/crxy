package cn.crxy

import scala.beans.BeanProperty
/**
 * 类的基本内容
 */
//在scala中，方法和类交织在一起
class class1{
//  println("hello crxy")
//  def add(a:Int,b:Int){
//    println(a + b)
//  }
  
  //在scala中，在类中定义的成员变量，默认会生成对应的set和get方法
  //set方法名value_=  ,get方法对应的方法名叫做value
  //使用var定义时会将上面生成的set和get方法提供给用户
//  var value = 100
  
  //在变量上添加@BeanProperty注解后，可以调用类似java的setValue和getValue方法
//  @BeanProperty var value = 100
  
  //使用val定义时不再提供set方法
//  @BeanProperty val value = 100
  
  //@BeanProperty和private不能再一起使用
  //使用private修饰后不再提供对应的set和get方法
  var value = 100
  
}

object TestClass {
  def main(args: Array[String]) {
	  val o = new class1
//	  o.value = 1000 //调用了set方法
//	  o.value_=(10000)
	  
//	  o.setValue(1100)
	  println(o.value)
//	  println(o.getValue)
//	  println(o.value)
	  
  }
}