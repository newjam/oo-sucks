package newjam;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleFooBarTest {
  
  private final FooBar instance = new SimpleFooBar();

  @Test
  public void testFoo() {
    assertEquals("foo", instance.foo());
  }

  @Test
  public void testBar() {
    assertEquals("bar", instance.bar());
  }

  @Test
  public void testFoobar() {
    assertEquals("foobar", instance.foobar());
  }

}
