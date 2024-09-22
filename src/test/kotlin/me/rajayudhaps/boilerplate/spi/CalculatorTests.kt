package me.rajayudhaps.boilerplate.spi

import me.rajayudhaps.boilerplate.factory.CalculatorFactory
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTests {

  lateinit var calculator: Calculator

  @BeforeAll
  fun setup() {
    calculator = CalculatorFactory.getCalculator()
  }

  @Test
  fun hasInstance() {
    assertNotNull(calculator)
  }

  @Test
  fun performAddTest() {
    assertEquals(6, calculator.add(2, 4))
  }
}