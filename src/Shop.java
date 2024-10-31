import java.util.ArrayList;

public class Shop {
    String name;
    ArrayList<Category> categories;

    Shop(String n) {
        name = n;
        categories = new ArrayList<>();
    }

    void addCategory(Category category) {
        categories.add(category);
    }

    void getProductsByCategory(String categoryName) {
        System.out.println("\nТовары в категории '" + categoryName + "':");
        for (Category category : categories) {
            if (category.name.equals(categoryName)) {
                for (Product product : category.products) {
                    System.out.println("  " + product.name + " - " + product.price + " тенге.");
                }
            }
        }
    }

    void getAllProducts() {
        System.out.println("Товары в магазине " + name + ":");
        for (Category category : categories) {
            for (Product product : category.products) {
                System.out.println("  " + product.name + " - " + product.price + " тенге.");
            }
        }
    }

}
