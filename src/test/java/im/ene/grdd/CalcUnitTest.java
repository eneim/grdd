package im.ene.grdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by eneim on 8/29/16.
 */
@RunWith(JUnit4.class) public class CalcUnitTest {

  private Calc calc;

  @Before public void setUp() {
    calc = new Calc();
  }

  @After public void tearDown() {
    calc = null;
  }

  @Test public void testCalcPlus() {
    Assert.assertEquals(10.50000001, calc.add(9, 1.5), 1e-6);
  }

  @Test public void testCalcPlusFail() {
    Assert.assertNotEquals(10.50001, calc.add(9, 1.5), 1e-6);
  }
}
