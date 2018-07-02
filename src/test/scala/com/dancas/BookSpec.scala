package com.dancas

import org.scalatest.{Matchers, WordSpec}
import java.lang.{IllegalArgumentException => IAE}

class BookSpec extends WordSpec with Matchers{

  "Creating a Book" should {

    "thrown an IllegalArgumentException for a ISBN field void" in {
      an[IAE] should be thrownBy Book("123456789", BookInfo("The Godfather", "The Godfather Description", 15.00), Author("Mario", "Puzo"))
    }
    "thrown an IllegalArgumentException for a Title or Description field void" in {
      an[IAE] should be thrownBy Book("1234567890", BookInfo("The Godfather", "", 15.00), Author("Mario", "Puzo"))
    }
    "thrown an IllegalArgumentException for a Book with Author null" in {
       an[IAE] should be thrownBy Book("1234567890", BookInfo("The Godfather", "description", 15.00), null)
    }
  }

}
