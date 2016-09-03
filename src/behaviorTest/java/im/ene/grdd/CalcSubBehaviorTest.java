package im.ene.grdd;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.logging.Logger;

/**
 * Created by eneim on 9/2/16.
 */
public class CalcSubBehaviorTest {

    private class State {
        private double start;
        private double eat;

        @Override
        public String toString() {
            return "State{" +
                    "start=" + start +
                    ", eat=" + eat +
                    '}';
        }
    }

    private Calc calc;
    private State stateObj;

    @Before
    public void setUp() {
        calc = new Calc();
        stateObj = new State();
        System.out.println("Before:" + stateObj.toString());
    }

    @After
    public void tearDown() {
        System.out.println("After: " + stateObj.toString());
        calc = null;
        stateObj = null;
    }

    @Given("^There are (\\d+) cucumbers$")
    public void thereAreStartCucumbers(double start) throws Throwable {
        stateObj.start = start;
    }

    @When("^I eat (\\d+) cucumbers$")
    public void iEatEatCucumbers(double eat) throws Throwable {
        stateObj.eat = eat;
    }

    @Then("^I should have (\\d+) cucumbers$")
    public void iShouldHaveLeftCucumbers(double left) throws Throwable {
        Assert.assertEquals(left, calc.sub(stateObj.start, stateObj.eat), 1e-8);
    }
}
