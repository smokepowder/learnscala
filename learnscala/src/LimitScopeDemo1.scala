package com{
  class UtilsTest{
     //����ͨ��������ΪUtils����private[scala]���Σ�ֻ����scala�����Ӱ���ʹ��
    //Utils.toString()
  }
  package scala{
    //private[scala]�޶�Utilsֻ����scala���Ӱ���ʹ��
    private[scala] object Utils{
      def toString(x:String){
        println(x)
      }
      import com.scala.tea._
      def getTeacher():Teacher=new Teacher("john")

    }
    
    package tea{
      class Teacher(var name:String) {
           //���Է���Utils�� tea��scala�����Ӱ�
           def printName()={Utils.toString(name)}
      }
    }
  }
}
object LimitScopeDemo1{
        import com.scala._
        import com.scala.tea._
        def main(args: Array[String]): Unit = {
            //����ͨ������ͬUtilsTest
            //Utils.toString(new Teacher("john").name)
            new Teacher("john").printName() 
        }

}
