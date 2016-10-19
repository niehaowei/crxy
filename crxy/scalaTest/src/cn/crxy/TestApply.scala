package cn.crxy

/**
 * apply方法
 */
class applyclass{
  def apply(name:String) = {
    println("call apply method = " + name)
  }
}

object TestApply {
  def main(args: Array[String]) {
    //scala用apply方法来简化集合或者类定义赋值
/*	  val arr1 = Array(1,2,3,4,5)
	  val arr2 = Array.apply(1,2,3,4,5)
	  
	  for(i <- arr2){
	    println(i)
	  }*/
    
    //如果给类定义的apply方法，在给类传递值时就可以直接使用  o("zhangsan")
    val o = new applyclass
//    o.apply("liudehua")
    o.apply("zhangxueyou")
  }
}