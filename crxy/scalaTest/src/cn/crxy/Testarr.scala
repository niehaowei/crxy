package cn.crxy

import scala.collection.mutable.ArrayBuffer

/**
 * 数组
 */
object Testarr {
  def main(args: Array[String]) {
    /*定长数组*/
    //数组定义[]中指定数组的元素类型  ()定义数组的长度
    val arr1 = new Array[Int](3)
    //下角标还是从0开始
    arr1.update(0, 9)
    for (i <- arr1) {
      println(i)
    }

    //()中是数组的元素   也可以指定类型 Any类型属于公共类型
    val arr2 = Array(1, 2, 3, 4, 5)
    val arr3 = Array[Any](1, 2, 3, 4, 5,"hehe" , "哈哈")
    //    for (i <- arr2) {
    //      println(i)
    //    }

//    for (i <- 0 to arr2.length - 1) {
//      println(arr2(i))
//    }
    
//    println(arr2.max)
//    println(arr2.min)
//    println(arr2.sum)
//    println(arr3.mkString)
//    println(arr3.mkString(","))  //Arrays.toString(arr) [1,2,3,4,5]
//    println(arr2.mkString("<",",",">"))  //Arrays.toString(arr) [1,2,3,4,5]
    
    /*变长数组*/
    val arr4 = ArrayBuffer(1,2,3,4,5,6)
    arr4 += 9
    arr4 -= 2
    
    val arr5 = arr2.toBuffer
//    arr5 += 8
//    val arr6 = arr4.toArray
    
//    println(arr4)
    
    arr4 --= arr5
//    for(i <- arr4){
//    	println(i)
//    }
  }
  
}