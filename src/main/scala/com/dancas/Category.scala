package com.dancas

case class Category(name: String) {

  require(name.contains("x"), "No contiene X")

}
