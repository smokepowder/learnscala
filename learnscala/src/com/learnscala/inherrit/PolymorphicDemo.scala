package com.learnscala.inherrit
//多态的例子
//抽象Person1类
abstract class AbstractPerson(var name:String,var age:Int){

  def walk():Unit
  //talkTo方法，参数为AbstractPerson类型
  def talkTo(p:AbstractPerson):Unit
}


class StudentA(name:String,age:Int) extends AbstractPerson(name,age){
  private var studentNo:Int=0
  def walk()=println("walk like a elegant swan")
  //重写父类的talkTo方法
  def talkTo(p:AbstractPerson)={
    println("talkTo() method in Student")
    println(this.name+" is talking to "+p.name)
  }
}

class Teacher(name:String,age:Int) extends AbstractPerson(name,age){
  private var teacherNo:Int=0

  def walk()=println("walk like a elegant swan")

   //重写父类的talkTo方法
  def talkTo(p:AbstractPerson)={
    println("talkTo() method in Teacher")
    println(this.name+" is talking to "+p.name)
  }
}

object PolymorphicDemo {
  def main(args: Array[String]): Unit = {

     //下面的两行代码演示了多态的使用
     //Person类的引用可以指向Person类的任何子类
     val p1:AbstractPerson =new Teacher("albert",38)
     val p2:AbstractPerson=new StudentA("john",38)

     //下面的两行代码演示了动态绑定
     //talkTo方法参数类型为Person类型
     //p1.talkTo(p2)传入的实际类型是Student
     //p2.talkTo(p1)传入的实际类型是Teacher
     //程序会根据实际类型调用对应的不同子类中的talkTo()方法
     p1.talkTo(p2)
     p2.talkTo(p1)
  }
}