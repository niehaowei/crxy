package cn.crxy

/**
 * 辅助构造器
 */
class class4() {
  var name: String = ""
  var age: Int = 0

  println("主构造器")
  
  def this(name: String) {
    //辅助构造器第一行需要调用主构造器
    this
    this.name = name
  }
  
  def this(age: Int) {
    //辅助构造器第一行需要调用主构造器
    this
    this.age = age
  }

  def this(name: String, age: Int) {
    this
    this.name = name
    this.age = age
  }

  def display {
    println("name=" + name)
    println("age=" + age)
  }
  

}

object TestGouzao2 {
  def main(args: Array[String]) {
    val o = new class4("zhangsan",90)
    println(o.age)
    o.display
  }
}