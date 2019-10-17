package com.decooda.exercise

import org.scalatest.FunSuite

class ListOperationsSpec extends FunSuite {

  test("Flatten a list ") {
    val list = List(List(1, 2, 3), List(4, 5, 6))
    assert(ListOperations.flatten(list) === List(1, 2, 3, 4, 5, 6))
  }

  test("Remove substring") {
    val list = List("language","scala is functional programming language", "functional programming language", "scala", "functional programming")
    assert(ListOperations.removeSubString(list) === List("scala is functional programming language"))
  }

  test("Substring  check") {
    val str1 = "scala is functional programming language"
    val str2 = "functional programming language"
    assert(ListOperations.isSubString(str1, str2))
  }

}

