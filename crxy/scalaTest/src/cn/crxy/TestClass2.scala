package cn.crxy

/**
 * 类的基本内容2
 */
class class2{
  private[this] var money = 100
  
  //自定义set方法
  def setMoney(money:Int){
    if(money > 0)   //自定义方法可以实现自己的逻辑
     this.money = money
  }
  
  //自定义get方法
  def getMoney = {
    this.money
  }
  
  def add(a:class2){
//    this.money += a.money //此种调用方法可以调用scala提供的get方法,变量添加[this]限制之后不能调用
    this.money += a.getMoney //利用其它方法可以
  }
}

object TestClass2 {
  def main(args: Array[String]) {
    
	  val o = new class2
	  o.setMoney(1000)
	  
	  val o1 = new class2
	  o1 setMoney 10000
	  o1.add(o)
	  
	  println(o1 getMoney)  //方法定义时如果带括号，调用时可以带也可以不带，方法定义时如果不带括号，调用时不能带括号
  }
}