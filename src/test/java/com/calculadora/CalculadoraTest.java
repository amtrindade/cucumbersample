package com.calculadora;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com.calculadora"},
        glue = {"com.calculadora"},
        plugin = {"pretty"})
public class CalculadoraTest {
}
