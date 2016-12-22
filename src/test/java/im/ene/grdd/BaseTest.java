package im.ene.grdd;

import org.junit.After;
import org.junit.Before;

/**
 * @author eneim
 * @since 12/22/16
 */
public abstract class BaseTest {

  protected Calc calc;

  @Before
  public void setUp() {
    calc = new Calc();
  }

  @After
  public void tearDown() {
    calc = null;
  }
}
