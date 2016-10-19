package cn.crxy

/**
 * 函数
 */
object TestFunction {
  def main(args: Array[String]) {

    //函数使用def定义
    def add0(a: Int, b: Int) { //在scala中叫做过程，过程指的是没有返回值的函数
      println(a + b)
    }
    println(add0(1,1))
    //    val c = add0(1,100)
    //    println(c)  //函数返回的()是一种单独的类型，Unit类型

    //有返回值的函数
    def add1(a: Int, b: Int): Unit = {
      a + b //scala默认返回函数最后一行的值
    }
    //    println(add1(1,2))

    //带参函数调用
    def add2(a: Int, b: Int) = {
      a + b //scala默认返回函数最后一行的值
    }
    //    val c = add2(a = 1, b = 3)
    //    println(c)

    //函数参数默认值
    def add3(left:String="[",name:String,right:String="]") = {
      left + name + right
    }
    val c = add3("<",name = "张三")
    println(c)
  }
}