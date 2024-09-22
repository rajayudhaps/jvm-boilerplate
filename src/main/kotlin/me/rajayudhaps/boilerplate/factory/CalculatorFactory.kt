package me.rajayudhaps.boilerplate.factory

import me.rajayudhaps.boilerplate.spi.Calculator
import java.util.ServiceLoader
import java.util.stream.Collectors

object CalculatorFactory {
  @JvmStatic
  fun getCalculator() : Calculator {
    return getCalculatorInstances().stream().findFirst().get()
  }

  @JvmStatic
  private fun getCalculatorInstances() : Set<Calculator> {
    var loader = ServiceLoader.load(Calculator::class.java)
    val instances = loader.stream()
      .map<Calculator> { e -> e.get() }
      .filter { e -> e != null }
      .collect(Collectors.toSet())
    if(instances.isEmpty()) {
      throw RuntimeException("Unable to load the license service instance.")
    }
    return instances
  }
}