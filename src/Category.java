import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<Product> products;

    Category(String n) {
        name = n;
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void getProductsInPriceRange(int minPrice, int maxPrice) {
        System.out.println("\nТовары в категории '" + name + "' в ценовом диапазоне от " + minPrice + " до " + maxPrice + " тенге.:");
        for (Product product : products) {
            if (product.price >= minPrice && product.price <= maxPrice) {
                System.out.println("  " + product.name + " - " + product.price + " тенге.");
            }
        }
    }
}
