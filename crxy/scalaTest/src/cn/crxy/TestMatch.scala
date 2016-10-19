package cn.crxy

/**
 *
 */

object TestMatch {
  def main(args: Array[String]) {
    
	  val ch = "*"
	  def func(a:Int,b:Int) = {
	    a + b
	  }
	  val rs = ch match {
	    case "crxy" => println("超人学院")
	    case "*" => "超人"
	    case "学院" => None
	    case _ if(ch.contains("*")) => ch
	    case _ => func _
	  }
	  
	  println(rs)
    
  }
}