//可以在任何地方定义这样形式的包，无论目录在哪里
package com{
  package learnscala{
    package packageimport{
      class Teacher {
  
      }
    }
  }
}

//在定义个包文件，编译后会自动编译到cn/scala/spark目录下
package cn{
  package scala{
    package spark{
      class SparkDemo{

      }
    }
  }
}
 