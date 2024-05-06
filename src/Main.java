
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy("Pharmacy A", "Location A");
        Pharmacy pharmacy2 = new Pharmacy("Pharmacy B", "Location B");
        Pharmacy pharmacy3 = new Pharmacy("Pharmacy A", "Location A");
        Pharmacy pharmacy4 = new Pharmacy("Pharmacy C", "Location C");


        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
    }
}