package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Product2 {
    int id;
    String name;
    float price;

    public Product2(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaFilteringUsingStream {
    public static void main(String[] args) {
        List<Product2> productsList = new ArrayList<Product2>();
        //Adding Products
        productsList.add(new Product2(1, "HP Laptop", 25000f));
        productsList.add(new Product2(2, "Dell Laptop", 31000f));
        productsList.add(new Product2(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product2(4, "Sony Laptop", 28000f));
        productsList.add(new Product2(5, "Apple Laptop", 90000f));
        List<Float> productPriceList2 = productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p -> p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
    }
}