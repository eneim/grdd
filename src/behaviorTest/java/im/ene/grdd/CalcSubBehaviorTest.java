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
    }

    private Calc calc;
    private State stateObj;

    static Logger logger = Logger.getLogger("Calc");
    static int counter = 0;

    @Before
    public void setUp() {
        logger.info("Setup: " + ++counter);
        calc = new Calc();
        stateObj = new State();
    }

    @After
    public void tearDown() {
        logger.info("Tear down: " + counter);
        calc = null;
        stateObj = null;
    }

    @Given("^There are (\\d+) cucumbers$")
    public void thereAreStartCucumbers(double start) throws Throwable {
        logger.info("Start: " + counter);
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
