package cn.crxy

/**
 * 映射
 */
object TestMap {
  def main(args: Array[String]) {
    /*不可变map*/
    //定义map
    //(zhangsan,15000)也叫对偶，使用()表示
    var map1 = Map[String, Int]("zhangsan" -> 15000, "lisi" -> 8000, "wangwu" -> 9000)
//    val map1 = Map[String, Int](("zhangsan",15000), "lisi" -> 8000, "wangwu" -> 9000)
//    val map1 = Map[String, Int](("zhangsan",15000), ("lisi" , 8000), ("wangwu", 9000))
//    for(i <- map1){
//      println(i)
//    }
    
    //利用map的key不能重复更改对应key的value
    map1 += ("wangwu" -> 16666)
    
    //代码健壮性判断
//    if(map1.contains("zhaoliu")){
//    		println(map1("zhaoliu"))
//  	}
//    println(map1.getOrElse("zhangsan", "不存在"))
    
    //其他遍历方式
//    println(map1.get("zhaoliu"))  //不存在的key使用该方式获取返回None
    val keys = map1.keys
    for(i <- keys){
//      println(map1.get(i))  //打印Some(value)
      println(map1.get(i).get)
    }
    
    /*可变map*/
    //改变map1元素的值
//    map1("wangwu") = 16000
    val map2 = scala.collection.mutable.Map[String,Int]("wangwu" -> 9000)
    map2("wangwu") = 18888
//    println(map2)
    println(map2)
    
  }

}