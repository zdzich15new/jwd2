package istatic;

public class StaticInnerDemo {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.instantiate();
        Outer.Inner inner2 = new Outer.Inner();

        Outer.MyEnum one = Outer.MyEnum.ONE;
    }
}
