package cn.crxy

/**
 * 高阶函数
 */
object TestFunction2 {
  def main(args: Array[String]) {
	//在scala,函数称之为一等公民，地位高
    //普通的有返回值的函数的定义
    def func1(a:Int,b:Int) = {
      a + b 
    }
//    println(func1(1,2))
    
    //将一个函数的实现传递给另外一个函数
    def func2 = func1 _   //“_”指的是将这个函数的实现传递给另外一个函数 而不是忘记给func1传递参数
    var func3 = func1 _
    
//    println(func2(2,3))
//    println(func1 _)  //打印函数 ，<function2>
    
    //定义一个匿名函数传递给另外一个函数
    def func4 = (a:Int,b:Int) => {a + b}
//    println(func4(3,3))
    
    //将一个函数传递给另外一个函数
    def func5(f:(Int) => (Int)) = {
      f(1) + 1
    }
    def func6(a:Int) = {
      a * 2
    }
//    println(func5(func6 _))   //3
    
    //接收两个参数的函数
    def func7(f:(Int,Int) => (Int),x:Int) = {
      f(x,2) + x
    }
//    println(func7((x:Int,y:Int) => (x + 1) , 2)) //
    
    
    def func8(f:(Int,Int) => (Int)) = {
      f(5,6)
    }
//    println(func8(func4))   //11
//    println(func5((x:Int) => (x + 2))) 
//    println(func5((x) => x + 2))  //去掉 参数类型 及实现体括号
//    println(func5(x => x + 2))   //去掉形参的括号
//    println(func5(_ * 2))   //1、匿名函数作为形参  2、只有一个形参 3、实现体只有一行语句 
    
    println(func8((x:Int,y:Int) => {x + y}))
    println(func8((x,y) => x + y))
    println(func8(_ + _))  //1、匿名函数作为形参   2、实现体只有一行语句 
    
    //"_"代表的意义总结
//    1、用于取元组的元素
//    2、代表元组占位符
//    3、传递方法时，指的是将这个函数的实现传递给另外一个函数 而不是忘记给func1传递参数
//    3、代表符合条件并且可以传递进来的任何一个值
    
    
  }
}