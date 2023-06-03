package inner.ilocal;

import java.util.Arrays;

public class Outer {
    public static void localClassInstantiate(String[] args) {
        class LocalClass {
            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }
        LocalClass localClass = new LocalClass();
        System.out.println(localClass);
    }
}
