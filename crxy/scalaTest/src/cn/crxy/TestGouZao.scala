package cn.crxy

/**
 * 主构造器
 */
//1、scala中class类和方法交织在一起
//2、class本身也是构造器，可以添加参数，如果给参数添加默认值可以实现构造器的重载
class class3(var name: String = null, val age: Int) { //主构造器
  
//  public class3(){}
  val value = 100

//  println("name=" + name)
  println("age=" + age)

}

object TestGouZao {
  def main(args: Array[String]) {
//    val o = new class3()   //调用class3()主构造器
//    val o = new class3("zhangsanfeng")
    val o = new class3("liudehua",90)
//    val o = new class3(age=90)

  }
}