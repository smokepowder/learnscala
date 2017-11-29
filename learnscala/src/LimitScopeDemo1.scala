package com{
  class UtilsTest{
     //编译通不过，因为Utils利用private[scala]修饰，只能在scala及其子包中使用
    //Utils.toString()
  }
  package scala{
    //private[scala]限定Utils只能在scala及子包中使用
    private[scala] object Utils{
      def toString(x:String){
        println(x)
      }
      import com.scala.tea._
      def getTeacher():Teacher=new Teacher("john")

    }
    
    package tea{
      class Teacher(var name:String) {
           //可以访问Utils， tea是scala包的子包
           def printName()={Utils.toString(name)}
      }
    }
  }
}
object LimitScopeDemo1{
        import com.scala._
        import com.scala.tea._
        def main(args: Array[String]): Unit = {
            //编译通不过，同UtilsTest
            //Utils.toString(new Teacher("john").name)
            new Teacher("john").printName() 
        }

}
