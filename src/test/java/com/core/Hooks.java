package com.core;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @After
    public void afterScenario(){
        System.out.println("This is run after the everty Scenario");
    }

    @Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }

}
