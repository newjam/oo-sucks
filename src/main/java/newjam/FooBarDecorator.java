package newjam;

public class FooBarDecorator implements FooBar {

  private final FooBar delegate;
  
  FooBarDecorator(FooBar delegate) {
    this.delegate = delegate;
  }
  
  @Override
  public String foo() {
    return delegate.foo();
  }

  @Override
  public String bar() {
    return delegate.bar();
  }

  @Override
  public String foobar() {
    return delegate.foobar();
  }
  
}
