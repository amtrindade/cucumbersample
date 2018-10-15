#https://medium.com/@mlvandijk/getting-started-with-cucumber-in-java-a-10-minute-tutorial-586652d2c82

Feature: Belly
    Optional description of the feature

    Scenario: a few cukes
        Given I have 42 cukes in my belly
        When I wait 1 hour
        Then my belly should growl 42

    Scenario: more cukes
        Given I have 64 cukes in my belly
        When I wait 2 hour
        Then my belly should growl 128