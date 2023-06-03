package lab20;

public class OuterDemo {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Inner.MoreInner moreInner = inner.new MoreInner();

        System.out.println(outer.getClass() + " number: " + outer.classNestNum);
        System.out.println(inner.getClass() + " number: " + inner.classNestNum);
        System.out.println(moreInner.getClass() + " number: " + moreInner.classNestNum);
    }
}
