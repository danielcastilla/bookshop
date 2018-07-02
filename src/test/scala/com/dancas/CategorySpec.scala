package com.dancas

import org.scalatest.{Matchers, WordSpec}
import java.lang.{IllegalArgumentException => IAE}

class CategorySpec extends WordSpec with Matchers{

  "Creating a Category" should {

    "thrown an IllegalArgumentException" in {
      an[IAE] should be thrownBy Category("x")
    }
  }

}
