package one;

import java.util.List;
import java.util.Arrays;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Albany", "Boulder", "Chicago", "Denver", "Eugene");

        findChicagoImperative(cities);
        findChicagoDeclarative(cities);
    }

    public static void findChicagoImperative(final List<String> cities) {
        boolean found = false;
        for (String city : cities) {
            if (city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println("Found Chicago?: " + found);
    }

    public static void findChicagoDeclarative(final List<String> cities) {
        System.out.println("Found Chicago?: " + cities.contains("Chicago"));
    }
}
