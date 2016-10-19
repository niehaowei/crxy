package cn.crxy

/**
 *
 */
object TestTuple {
  def main(args: Array[String]) {
	//元组定义
    //元组也使用()表示，对偶是特殊的元组
    val t1 = (9,2,3,4,5)
    //取出元组的值
    //元组的下角标是从1开始
//    println(t1._1)
//    println(t1._3)
    
    val list = t1.productIterator.toList
//    for(i <- list){
//      println(i)
//    }
    
    //使用模式匹配方式取元组元素
    val (first,second,third,_,_) = t1   //"_"代表占位符，在不想定义元组元素对应的名称时可以使用
//    println(first)
    
//    val map0 = Map[String, Int]("zhangsan" -> 15000, "lisi" -> 8000, "wangwu" -> 9000)
//    for((k,v) <- map0){
//      println(k + "->" + v)
//    }
    
    //元组的应用场景
    def func(a:Int , b:Int) = {
      val x = a + 1
      val y = b * 2
      (x , y , a + b)
    }
//    println(func(4,5)._2)
    
    
    //拉链操作
    val arr1 = Array("a" , "b" , "c" ,"d")
    val arr2 = Array(1,2,3)
    val tmp = arr1.zip(arr2)  //以元组为元素的数组 (a,1),(b,2),(c,3)
//    println(tmp.mkString(","))
    
    val map = tmp.toMap
    println(map)
    
  }
}