package com.learnscala.scope.privatescope

class Student(var name:String,var age:Int){
  private var sex:Int=0
  //内部类
  class Course(val cName:String,val gpa:Float){
    //可以直接访问其外部类的私有成员
    def getStudentSex(student:Student)= student.sex
  }
}

//班级类
class Class{
  //下面这条语句统计通不过，因为sex是私有的
  // def getStudentSex(student:Student)=student.sex
}
object Student {
  private var studentNo:Int=0;
  def uniqueStudentNo()={
    studentNo+=1
    studentNo
  }
  def apply(name:String,age:Int)=new Student(name,age)

  def main(args: Array[String]): Unit = {
    println(Student.uniqueStudentNo())
    val s=new Student("john",29)
    //直接访问伴生类Student中的私有成员
    println(s.sex)

    val s1=Student("john",29)
    println(s1.name)
    println(s1.age)

    //使用内部类
    val c1=new s1.Course("Scala",3.0f)
    
    

  }
}