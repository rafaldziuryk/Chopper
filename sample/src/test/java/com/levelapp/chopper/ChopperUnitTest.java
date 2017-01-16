package com.levelapp.chopper;

import static org.junit.Assert.assertTrue;

import com.levelapp.annotation.Chopper;
import com.levelapp.choppertest.chain.ChainField;
import com.levelapp.choppertest.dispose.DisposeElement;
import com.levelapp.choppertest.dispose.DisposeField;
import com.levelapp.choppertest.nullcheck.AllFieldToNull;
import com.levelapp.choppertest.nullcheck.SomeFieldToNull;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ChopperUnitTest {

  @Test
  public void chopperAllField() throws Exception {
    AllFieldToNull allFieldToNull = new AllFieldToNull("Test1", "Test2");
    Chopper.chopp(allFieldToNull);
    assertTrue(allFieldToNull.s1 == null);
    assertTrue(allFieldToNull.s2 == null);
  }

  @Test
  public void chopperSomeField() throws Exception {
    SomeFieldToNull someFieldToNull = new SomeFieldToNull("Test1", "Test2");
    Chopper.chopp(someFieldToNull);
    assertTrue(someFieldToNull.s1 == null);
    assertTrue(someFieldToNull.s2 != null);
  }

  @Test
  public void chopperDisposableTest() throws Exception {
    DisposeField disposeField = new DisposeField(new DisposeElement());
    Chopper.chopp(disposeField);
    assertTrue(disposeField.isDisposed());
  }

  @Test
  public void chopperChainTest() throws Exception {
    ChainField chainField = new ChainField();
    Chopper.chopp(chainField);
    assertTrue(chainField.isChopped());
  }
}