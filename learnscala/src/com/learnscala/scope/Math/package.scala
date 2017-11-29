package com.learnscala.scope
//包对象主要用于将常量、工具函数，使用时直接通过包名引用
//利用package关键字定义单例对象
package object Math {
   val PI=3.141529
   val THETA=2.0
   val SIGMA=1.9
}

class Coputation{
  def computeArea(r:Double)=Math.PI*r*r
}