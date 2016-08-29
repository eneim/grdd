package im.ene.grdd;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

/**
 * Created by eneim on 8/29/16.
 */
@RunWith(Cucumber.class)
public class CalcBehaviorTest {

  private class Operator {
    double left;
    double right;

    Operator(double left, double right) {
      this.left = left;
      this.right = right;
    }
  }

  private Calc calc;
  private Operator operator;
  private double result;

  @Before
  public void setUp() {
    calc = new Calc();
    operator = null;
    result = 0;
  }

  @After
  public void tearDown() {
    calc = null;
    operator = null;
    result = 0;
  }

  @Given("^I have two double: (\\d+) and (\\d+)\\.(\\d+)$")
  public void iHaveTwoDoubleAnd(int arg0, int arg1, int arg2) throws Throwable {
    operator = new Operator(arg0, arg1 + (arg2 / 10.0));
  }

  @When("^I call a plus of them$") public void iCallAPlusOfThem() throws Throwable {
    result = calc.plus(operator.left, operator.right);
  }

  @Then("^I should have the result of (\\d+)\\.(\\d+)$")
  public void iShouldHaveTheResultOf(int arg0, int arg1) throws Throwable {
    Assert.assertEquals(arg0 + (arg1 / 10.0), result, 1e-6);
  }
}
