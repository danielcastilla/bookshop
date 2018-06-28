package com.dancas

case class BookInfo(title: String, description: String, price: BigDecimal) {

  require(!title.isEmpty, "Title field is required")
  require(!description.isEmpty, "Description field is required")


}
