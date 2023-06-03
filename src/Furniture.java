import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Furniture {

    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Adde", "IKEA", 2016);
        Chair chair3 = new Chair("Janinge", "IKEA", 2016);
        Chair chair4 = new Chair("Adde", "IKEA", 2015);

//        System.out.println(chair1.hashCode());
//        System.out.println(chair2.hashCode());
//
//        System.out.println(chair1.equals(chair2));

        Set<Chair> furniture = new HashSet<>();
        furniture.add(chair1);
        furniture.add(chair2);
        furniture.add(chair3);
        furniture.add(chair4);

        //System.out.println(furniture);

        Iterator<Chair> iterator = furniture.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
