package crxytest

import scala.beans.BeanProperty

/**
 * Created by Administrator on 2016/10/18.
 */
class TestClass {
  //对应的set方法的名称是 age_= ,对应的get方法名称是age
  var age:String="28";
  var fds:Int=30;
  private var addr:String="beijing";
  @BeanProperty val name="niehw";


  var sex:String="nan"
  def setSex(sexstr:String): Unit ={
    this.sex=sexstr
  }


}

object TestClass extends  App{
  var testClass = new TestClass
  println(testClass.age)
  testClass.age_=("29")//set 方法age_=()
  testClass.addr_=("shanghai");
  println(testClass.addr+"|"+testClass.age+"|"+testClass.getName)
}