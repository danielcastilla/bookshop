package com.dancas

case class Book(isbn: String, bookInfo: BookInfo, author: Author) {

  require(isbn.size==10, "ISBN field is required")
  require(author!=null, "Author field is required")
  require(bookInfo!=null, "BookInfo is required")

}
