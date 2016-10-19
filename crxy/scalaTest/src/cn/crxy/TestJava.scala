package cn.crxy

import java.util.ArrayList
import scala.collection.mutable.ArrayBuffer

/**
 * 与java的互操作
 */
object TestJava {
  def main(args: Array[String]) {
	
    //scala应用java的api
    val list = new ArrayList[Int](3)
    list.add(10)
    list.add(12)
    for(i <- 0 to list.size() - 1){
      println(list.get(i))
    }
    
    //将scala集合转换为java集合
    val arr = ArrayBuffer(1,2,3,4)
    val list1 = scala.collection.JavaConversions.bufferAsJavaList(arr)
    
  }
}