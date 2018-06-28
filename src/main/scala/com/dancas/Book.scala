package com.dancas

case class Book(isbn: String, title: String, description: String, price: BigDecimal, author: Author) {

  require(isbn.isEmpty, "ISBN is a required field")
  require(title.isEmpty && description.isEmpty, "A required field is empty")
  require(author!=null, "Author is required")


}
