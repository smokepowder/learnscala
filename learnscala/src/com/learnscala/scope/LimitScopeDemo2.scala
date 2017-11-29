package com.learnscala.scope
//private[this]，限定只有该类的对象才能访问，称这种成员为对象私有成员
class Teacher(var name: String) {
  private[this] def printName(tName:String="") :Unit= { println(tName) }
  //调用private[this] printName方法
  def print(n:String)=this.printName(n)
}

object Teacher{
   //private[this]限定的成员，即使伴生对象Teacher也不能使用
  //def printName=new Teacher("john").printName()
}

object LimitScopeDemo2 {
  def main(args: Array[String]): Unit = {
          //编译不能通过
         //new Teacher("john").printName()
  }

}
