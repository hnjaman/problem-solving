package lambda;

//Java Lambda Expression Example: Filter Collection Data
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Product4{
    int id;
    String name;
    float price;
    public Product4(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionExample11 {
    public static void main(String[] args) {
        List<Product4> list=new ArrayList<Product4>();
        list.add(new Product4(1,"Samsung A5",17000f));
        list.add(new Product4(3,"Iphone 6S",65000f));
        list.add(new Product4(2,"Sony Xperia",25000f));
        list.add(new Product4(4,"Nokia Lumia",15000f));
        list.add(new Product4(5,"Redmi4 ",26000f));
        list.add(new Product4(6,"Lenevo Vibe",19000f));

        // using lambda to filter data
        Stream<Product4> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
    }
}
