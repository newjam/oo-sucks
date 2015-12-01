package newjam;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DoubleFooTest {
  
  private final FooBar instance = new DoubleFoo(new SimpleFooBar());

  @Test
  public void testFoo() {
    assertEquals("foofoo", instance.foo());
  }

  @Test
  public void testBar() {
    assertEquals("bar", instance.bar());
  }

  @Test
  public void testFoobar() {
    // Fails because a decorated object wont dynamically dispatch to the decorator.
    assertEquals("foofoobar", instance.foobar());
  }

}
