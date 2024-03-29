import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Basket{

    private Map<String, Integer> basket;
    public ShoppingCart() {
        this.basket= new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(basket.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return basket.get(product);
    }
}

interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProduct(String product, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String product);
}