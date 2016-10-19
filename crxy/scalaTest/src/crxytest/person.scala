package crxytest

/**
 * Created by Administrator on 2016/10/19.
 */
abstract class person {

  var name:String ="zhangsan"
  var name1:String
  val age:Int=19
  val age1:Int
  def interest1():String
  def interest():String={
    "music"
  }

}
class student extends person{


  override var name1: String = _
  override val age1: Int =8
  override def interest1(): String = super.interest()
  println("---------------student ")
}
object testclassdd{
  def main(args: Array[String]) {
    val stu = new student
    println(stu.name)
    println("////////////////////////////////////////")

     val student: student1 = new student1
    println("name------------"+student.name)
    println("age--------------"+student.age)
    println("interest.len--------------------------"+student.interest.length)
  }
}

class student1 extends person1{
  println("---------------student1 ")
  override val age: Int = 20
}

class  person1{
  println("---------------person1 ")
  val name:String="lisi"
  val age:Int= 10
  lazy  val interest:Array[Int] = new Array[Int](age);
}