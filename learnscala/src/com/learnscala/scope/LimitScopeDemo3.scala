package com.learnscala.scope
//private��������༰����������Է���
class Phone(var name: String) {
  private def printName(tName:String="") :Unit= { println(tName) }
  //���Է���
  def print(n:String)=this.printName(n)
}

object Phone{
  //����������Է���
  def printName=new Phone("john").printName()
}

object LimitScopeDemo3 {
  def main(args: Array[String]): Unit = {
          //���ܷ���
         //new Phone("john").printName()
  }

}
 