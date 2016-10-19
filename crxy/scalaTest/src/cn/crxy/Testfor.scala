package cn.crxy

/**
 * 控制结构--while、for
 */
object Testfor {
  def main(args: Array[String]) {
    //	  while(){
    //	    println("superman")
    //	  }

    //    for(int i = 0 ; i<5 ; i++)
    //    for(i : List)

    /*基本for循环*/
        println(1 to 10)
        for(i <- 1 to 10){//闭区间
          println(i)
        }

    //    for(i <- 1 until 10){//开区间
    //      println(i)
    //    }

    //    for(i <- 10 to 1){
    //      println(i)
    //    }
    //    for (i <- (1 to 10)reverse) {//倒序
    //      println(i)
    //    }

    //    for(i <- "superman"){
    //      println(i)
    //    }

    /*高级for循环*/
    //守卫
    //    for(i <- 1 to 10 ; if i % 3 == 0){ //守卫实现改变步长
    //      println(i)
    //    }

    //    for (i <- 1 to (10, 3)) { //修改步长
    //      println(i)
    //    }

    //双重for循环
    //    for (i <- 1 to 10) { 
    //      for (j <- 1 to 5) {
    //        println(i + "->" + j)
    //      }
    //    }

    //    for (i <- 1 to 10; j <- 1 to 5) { //
    //      println(i + "->" + j)
    //    }

    //for的推导式
    val c = for (i <- 1 to 10) yield { val c = i * 2; c }
    //    println(c)
    for (i <- c) {
      println(i)
    }
  }
  
  
}