
import java.util.*;
import java.util.List;
import java.util.ArrayList;
/**
 * 
 */
public class ProductInventory {


    /**
     * 
     */
    private List<Product> products;

    /**
     * 
     */
    public  ProductInventory() {
        products = new ArrayList<>();
    }

    /**
     * @param product 
     * @return
     */
    public void addProduct(Product product) {
        products.add(product);

    }

    /**
     * @param id 
     * @return
     */
    public void removeProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    /**
     * @param name 
     * @return
     */
    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * @return
     */
    public double calculateTotalValue() {
        double total = 0;

        for (Product product : products) {
            total += product.calculateFinalPrice();
        }

        return total;
    }


}