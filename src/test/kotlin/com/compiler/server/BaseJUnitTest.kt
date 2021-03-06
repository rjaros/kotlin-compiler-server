package com.compiler.server

import com.compiler.server.model.TestDescription
import com.compiler.server.model.TestStatus
import org.junit.jupiter.api.Assertions

open class BaseJUnitTest {
  fun successTestCheck(testResults: List<TestDescription>) {
    testResults
      .map { it.status }
      .forEach {
        Assertions.assertTrue(it == TestStatus.OK)
      }
  }


  val koansUtilsFile = "package koans.util\n\nfun String.toMessage() = \"The function '\$this' is implemented incorrectly\"\n\nfun String.toMessageInEquals() = toMessage().inEquals()\n\nfun String.inEquals() = this"
}