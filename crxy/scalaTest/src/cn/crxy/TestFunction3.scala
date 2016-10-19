package cn.crxy

/**
 * 常见的高阶函数举例
 */
object TestFunction3 {
  def main(args: Array[String]) {
    //map 和 foreach
    //map将括号中函数作用集合的每一个元素
    //foreach简单遍历集合
    //	  (1 to 10).map("*" * _).foreach(println)

    //filter用于过滤集合元素，filterNot过滤出不包含指定条件的元素
    //	  (1 to 10).filterNot(_ % 2 == 0).map(_ * 2).foreach(println)

    //    println((1 to 10).reduceLeft(_ - _))  //0 + 1 1 + 2   3 + 3   6 + 4  ...
    //    println((1 to 10).reduceRight(_ - _))  //10 + 9 19 + 8 ...
	  (1 to 10).reduce(_ + _)
	  
    //去重
    //    val arr = Array("a","b","c","a","c")
    //    println(arr.distinct.mkString(","))

    val arr1 = Array(1, 8, 3, 5, 4)
    val arr2 = arr1.sorted //sorted对数组进行排序，产生一个新的已经排好序的数组，源数组不做更改(升序)
    //    println(arr2.mkString(","))
    scala.util.Sorting.quickSort(arr1)
    //    println(arr1.mkString(","))

    //对字符根据字段排序
    val arr3 = List("dsf", "kdfs", "dsr", "asdf")
    val arr4 = arr3.sorted
    //    println(arr4)

    val arr5 = arr1.sortWith(_ > _) //sortWith指定排序方式进行排序
    //    println(arr5.mkString(","))

    val map = Map[String, Int]("ahangsan" -> 15000, "lisi" -> 8000, "wangwu" -> 9000, "zhaoliu" -> 19000)
    //    map.sorted //map没有sorted排序函数
    //    map.sortWith(_ > _)
    val map1 = map.toList.sortBy(_._1)
    val map2 = map.toList.sortBy(_._2)
//    println(map1)
//    println(map2)
    
    map.toList.sortBy(_._2) foreach {
      case (k,v) =>
        println(k + "->" + v)
    }
    
    val s = "superman"
//    println(s.substring(3,9))
//    println(s.slice(3,9))
    val arr6 = Array(1,2,3,4,5,6)
    println(arr6.slice(3, 9).mkString(","))
  }
}