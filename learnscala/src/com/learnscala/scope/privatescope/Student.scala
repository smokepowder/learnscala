package com.learnscala.scope.privatescope

class Student(var name:String,var age:Int){
  private var sex:Int=0
  //�ڲ���
  class Course(val cName:String,val gpa:Float){
    //����ֱ�ӷ������ⲿ���˽�г�Ա
    def getStudentSex(student:Student)= student.sex
  }
}

//�༶��
class Class{
  //�����������ͳ��ͨ��������Ϊsex��˽�е�
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
    //ֱ�ӷ��ʰ�����Student�е�˽�г�Ա
    println(s.sex)

    val s1=Student("john",29)
    println(s1.name)
    println(s1.age)

    //ʹ���ڲ���
    val c1=new s1.Course("Scala",3.0f)
    
    

  }
}