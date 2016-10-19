package cn.crxy

/**
 *   对象
 */

class object1{
  def show = object1.value
}

//在scala中，当对象名称和class名称一样时，把这个对象object叫做这个class类的伴生对象
object object1 {
  private val value = 100
  
}

object object2 {
  private val value = 100
  
}

object TestObject {
  def main(args: Array[String]) {
    //在scala中object也叫对象是一种单独的类型
    //定义object对象可以实现静态字段和静态方法的功能,在scala没有静态字段static关键字
//    println(object1.value)
    val o = new object1
//    val o1 = new object2

    println(o.show)
    
  }
}