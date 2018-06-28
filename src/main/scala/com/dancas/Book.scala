package com.dancas

case class Book(isbn: String, title: String, description: String, price: BigDecimal) {

  require(isbn.isEmpty, "ISBN is a required field")
  require(title.isEmpty && description.isEmpty, "A required field is empty")



}
