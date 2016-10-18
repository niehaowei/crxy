
import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 2016/10/18.
 */
class Testarr {
println("niehw----")
  //对应的set方法的名称是 age_= ,对应的get方法名称是age
  var age:String="28";
  @BeanProperty val name="niehw";
//lllll
  private val address:String="beijing"




}

object Testarr {
  def main(args: Array[String]) {
    /* val arr1 = new Array[Int](3)
     arr1(1) = 9
     //Any是公共类型
     var arr2 = Array[Any](1, 2, 3, 4, 5, "hello", "哈哈")
     for (i <- arr2) {
       println(i)
     }
     /*变长数组*/
     //变长转定长 toArray
     //定长转变长toBuffer
     val  arr3=arr2.toBuffer
     arr3+=8
     println(arr3)
     val arr4 = ArrayBuffer(1, 2, 3, 4)
     arr4 += 9
     arr4 -= 2
     for (i <- arr4) {
       println(i)
     }*/
    import scala.collection.immutable.HashMap;
    val map1 = HashMap[String, String]("hh" -> "hh", "kk" -> "kk")
    println(map1.get("hh").get)
    println(map1.get("hh"))
    import scala.collection.mutable.{HashMap => muMap};
    val map2 = muMap[String, Int] {
      "sa" -> 2
    };
    println(map2)
    val t1 = (1, 2, 3, 4, 5)
    //元组转化为list
    val list = t1.productIterator.toList

    def func(a:Int ,b:Int) ={
      (a,b)
    }
    println(func(2,3))

    val arr3=Array(1,2,3,4,5)
    val arr4 =Array("a","b","c","d","e")
    //带地址的数据是数组，两个数组可以转换为元素是元组的数组zip
    var tmp = arr4.zip(arr3)
    println(tmp.mkString("|"))
    var map = tmp.toMap
    println(map)

    val arr5 = ArrayBuffer(1,2,3,4)
    val list1=scala.collection.JavaConversions.bufferAsJavaList(arr5)
    println(list1)


  }
}