package cn.crxy

/**
 * 继承顺序
 */
class person1{
  val name:String = "lisi"
  val age:Int = 10
  println("person1.age="+age)
  lazy val interest:Array[Int] = new Array[Int](age)  //会调用age的get方法
}

class student1 extends person1{
  override val age:Int = 20
}

object TestExtend2 {
  def main(args: Array[String]) {
	  val o = new student1
	  println("name = " + o.name)
	  println("age = " + o.age)
	  
	  /*
	   * 1、首先实例化student1，student1发现继承了父类person1
	   * 2、相当于告诉父类student1类要覆盖了父类person1类的age字段
	   * 3、父类person1首先对自身变量调用set方法进行赋值
	   * 4、赋值到interest变量上时，需要调用age的get方法初始化interest数组长度
	   * 5、父类person1初始化完毕后，开执行子类的初始化，age字段被赋值为20
	   * 6、添加了lazy关键字之后，interest的数组初始化在整个初始化最后
	   * */
	  println("interest.lenth = " + o.interest.length)
	  
  }
}