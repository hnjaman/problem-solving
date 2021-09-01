package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products

            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));

       // List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
//String output = list.stream().distinct().collect(Collectors.joining(","));
        long l = productsList.stream().distinct().count();
       // String productPriceList2 =productsList.stream().distinct();
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
        System.out.println(l);
    }
}
