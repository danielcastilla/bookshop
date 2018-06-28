package com.dancas

import org.scalatest.{Matchers, WordSpec}
import java.lang.{IllegalArgumentException => IAE}

class BookSpec extends WordSpec with Matchers{

  "Creating a Book" should {
    "thrown an IllegalArgumentException for a isbn field void" in {
      an[IAE] should be thrownBy Book("", "The Godfather", "Description", 15.00)
    }
    "thrown an IllegalAtgumentException for a title or description field void" in {
      an[IAE] should be thrownBy Book("1234567890", "The Godfather", "", 15.00)
    }
  }

}
