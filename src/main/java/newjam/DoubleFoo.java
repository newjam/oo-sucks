package newjam;

class DoubleFoo extends FooBarDecorator {

  DoubleFoo(FooBar delegate) {
    super(delegate);
  }
  
  @Override
  public String foo() {
    return super.foo() + super.foo();
  }
  
}
