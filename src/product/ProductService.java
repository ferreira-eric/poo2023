package product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static List<Product> productList = new ArrayList<>();

    public static void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product add with success!");
    }

    public static void ProductsList() {
        System.out.println("\nList of Products:");

        if (productList.isEmpty()) {
            System.out.println("Without product");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public static void putProduct(int id, String novoNome, double novoPreco) {
        Product withProduct = findProductById(id);

        if (withProduct != null) {
            withProduct.setName(novoNome);
            withProduct.setPrice(novoPreco);
            System.out.println("Product update with success!");
        } else {
            System.out.println("Product not found");
        }
    }

    public static void deleteProduct(int id) {
        Product withProduct = findProductById(id);
        if (withProduct != null) {
            productList.remove(withProduct);
            System.out.println("Product removed with success!");
        } else {
            System.out.println("Product not found");
        }
    }

    private static Product findProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}

