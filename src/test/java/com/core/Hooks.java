package com.core;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @After(order = 1)
    public void afterScenario(Scenario scenario){
        System.out.println("This is run after the every Scenario: "+scenario.getName());
    }

    @Before(order = 1)
    public void beforeScenario(Scenario scenario){
        System.out.println("This will run before the every Scenario: "+scenario.getName());
    }

    @After(value="@soma", order = 10)
    public void afterSoma(){
        System.out.println("This will run after soma Scenarios");
    }

    @Before(value="@soma", order = 1)
    public void beforeSoma(){
        System.out.println("This will run before soma Scenarios");
    }

}
