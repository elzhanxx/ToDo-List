import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shop> shops = new ArrayList<>();

        Shop shop = new Shop("Планета электроники");

        Category phones = new Category("Смартфоны");
        phones.addProduct(new Product("iPhone 16 Super Digital Atmos 4K ULTRA Pro XS Max", 999_990));
        phones.addProduct(new Product("GoogLe PixEL 9 mini", 666_660));

        Category laptops = new Category("Ноутбуки");
        laptops.addProduct(new Product("MacBook Pro 2024",  1_529_990));
        laptops.addProduct(new Product("Acer Nitro 5 2019", 250_000));

        shop.addCategory(phones);
        shop.addCategory(laptops);

        shops.add(shop);

//        Shop.showInfo(shops);
//        shop.getProductsByCategory(laptops.name);
//        shop.getAllProducts();
//        laptops.getProductsInPriceRange(220_000,260_000);
    }
}
