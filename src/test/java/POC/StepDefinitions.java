package POC;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {
    private Belly belly;

    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(int numberCukes) throws Throwable {
        belly = new Belly();
        belly.eat("Dado @Given test with "+ numberCukes+ " cukes!");
        belly.setCookie(numberCukes);
    }

    @Given("I have cukes in my belly:")
    public void i_have_cukes_in_my_belly(List<Entry> entries) throws Throwable {
        //List<Entry> beliesDT = dt.asList(Entry.class);

        for (Entry bellyDT : entries){
            belly.setCookie(bellyDT.first);
        }
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer hour) throws  Throwable {
        belly.eat("Quando @When test with "+ hour +" hour");
        belly.setHour(hour);
    }

    @Then("my belly should growl {int}")
    public void my_belly_should_growl(int value) {
        belly.eat("Então @Then test my belly should growl");
        assertEquals(value, belly.calc());
    }

    static final class Entry {
        private final int first;


        Entry(int first) {
            this.first = first;
        }
    }
}
