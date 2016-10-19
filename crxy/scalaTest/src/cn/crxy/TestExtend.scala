package cn.crxy

/**
 * 继承
 */
abstract class person{
  var name:String 
  val age:Int
  def interest:String
}

class student extends person{
  var name:String = "zhangsan"   //scala中var定义的变量只能使用var覆盖
  val age:Int = 19			//scala中，val定义的常量只能使用val覆盖
  override def interest:String = "music"  //scala规定，def定义的方法可以使用val或者def进行覆盖
}

object TestExtend {
  def main(args: Array[String]) {
    
	//1、抽象类不一定有抽象字段或者是抽象方法
    //2、有抽象字段或者抽象方法一定是抽象类
    //3、当父类不是一个抽象类的时候，子类得override关键必须写；当父类是抽象类时候，可以写可以不写
    //4、子类覆盖父类的字段时其实覆盖父类的字段所对应的set和get方法
    
    val o = new student
    println(o.name)
    println(o.age)
    println(o.interest)
    
  }
}