package com.learnscala.scope
//private，定义的类及伴生对象可以访问
class Phone(var name: String) {
  private def printName(tName:String="") :Unit= { println(tName) }
  //可以访问
  def print(n:String)=this.printName(n)
}

object Phone{
  //伴生对象可以访问
  def printName=new Phone("john").printName()
}

object LimitScopeDemo3 {
  def main(args: Array[String]): Unit = {
          //不能访问
         //new Phone("john").printName()
  }

}
 