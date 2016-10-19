package crxytest

/**
 * Created by Administrator on 2016/10/19.
 */
/**/
class TestFunction2 {



}
object TestFunction2{
  def main(args: Array[String]) {
    def func1 (a:Int,b:Int)={
      a+b
    }
    println(func1(2,4))
    def func2=func1 _ //"_"指的是将这个函数的实现传递给另一个函数，而不是忘记给fun2传参

    var func3=func1 _
    println(func3) //打印函数，传递一个函数.

    //定义一个匿名函数传递给另外一个函数
    //var a=b=2
    (a:Int,b:Int)=>{a+b} //匿名
     def func4= (a:Int,b:Int)=>{a+b}//

  }
}