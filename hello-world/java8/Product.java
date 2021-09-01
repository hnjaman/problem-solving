package java8;

public class Product {
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        final Product book = (Product) obj;
        if (this == book) {
            return true;
        } else {
            return (this.name.equals(book.name) && this.price == book.price && this.id==book.id);
        }
    }

    @Override
    public int hashCode() {
        int hashno = 2;
        hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
        return hashno;
    }
}
