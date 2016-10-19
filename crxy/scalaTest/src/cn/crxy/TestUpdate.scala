package cn.crxy

/**
 * update方法
 */
class updateclass {
  def update(first: String, second: String, third: String) = {
    println("call update method")
    first + "|" + second + "|" + third
  }
}

object TestUpdate {
  def main(args: Array[String]) {
	  val o = new updateclass
//	  println(o.update("zhangsan", "lisi", "zhaoliu"))
	  //使用update方法可以简化对集合值的更新
	  //使用update方法是，等号后面的值会转化为update方法的最后一个参数
	  println(o("zhangsan", "lisi") = "zhaoliu")
  }
}