package cn.crxy

/**
 * 控制结构if
 */
object TestIf {
  def main(args: Array[String]) {
    println(judge(-100))
  }

  def judge(a: Int) :Int = {
    if (a > 0) { //分层判断
      return 1   //scala的return不返回值，return相当于函数版break语句
    } else if (a < 0) {
      return -1
    }
      0
  }
}