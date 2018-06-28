package com.dancas

case class Author(name: String, surname: String) {

  require(!name.isEmpty, "Name field is required")
  require(!surname.isEmpty, "Surname field is required")

}
