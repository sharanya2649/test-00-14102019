package com.decooda.exercise

object ListOperations {
  /**
    * Flatten a list of list into List
    * Example:
    * List(List(1,2,3), List(4,5,6)) output would be List(1,2,3,4,5,6)
    * Note - mutation and Scala's function flatmap and flatten are not allowed.
    */
  def flatten(list: List[List[Int]]): List[Int] = {
    def help(list: List[List[Int]], result: List[Int]): List[Int] =
      list match {
      case Nil => result
      case head :: tail => help(tail, head.foldLeft(result) { (acc, ele) => acc :+ ele })
    }
    help(list, Nil)
  }

  def help2(list: List[String], head: String): Boolean = {
    val lis= list.map { x => if (x != head) isSubString(x, head) else false}
    println(lis)
    def help3(list:List[Boolean],res:Boolean):Boolean={
      if(res==true||list.isEmpty) res
      else help3(list.tail,if(list.head==true) true else false)
    }
    println(help3(lis,false))
    help3(lis,true)
  }
  def removeSubString(list: List[String]): List[String] = {
    //        def help(list: List[String],result:List[String]):List[String]=list match{
    //          case Nil=>result
    //          case head::tail=>
    //            if(help2(tail,head)==false) help(tail,head::result)
    //            else help(tail,result)
    //        }
    //        help(list,Nil)

    def help(list: List[String], result: List[String]): List[String] = {
      if (list.isEmpty) result
      else {
        if (help2(list, list.head) == false) help(list.tail, list.head :: result)
        else help(list.tail, result)
      }

    }
    help(list,Nil)
  }

  /**
    *
    * Remove all sub string from List
    * for eg:
    * List("java language", "scala is functional programming language", "functional programming language", "scala")
    * output would be List("java language","scala is functional programming language")
    * Assumption- All input string should be in lowercase
    * Note - mutation is not allowed
    */


  /**
    * return true if str2 is substring of str1 otherwise false
    *
    */
  def isSubString(str1: String, str2: String): Boolean = {
    str1.matches(s".*\\b$str2\\b.*")
  }

}
