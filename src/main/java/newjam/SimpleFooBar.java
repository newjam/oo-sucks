package newjam;

public class SimpleFooBar implements FooBar {

  @Override
  public String foo() {
    return "foo";
  }

  @Override
  public String bar() {
    return "bar";
  }
  
  @Override
  public String foobar() {
    return this.foo() + this.bar();
  }
  
}
