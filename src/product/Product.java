package product;

public class Product {

    private static int idCounter = 1;

    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    public static Product createProduct(String nome, double preco) {
        return new Product(nome, preco);
    }
}
