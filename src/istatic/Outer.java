package istatic;

public class Outer {

    public static class Inner{

    }

    public Inner instantiate() {
        return new Inner();
    }

    public enum MyEnum {ONE, TWO} //domyslnie statyczny

    public interface MyInterface {} //domyslnie statyczny
}
