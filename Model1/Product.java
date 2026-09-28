
import java.util.*;

/**
 * 
 */
public abstract class Product {

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private double price;

    /**
     * @param id 
     * @param name 
     * @param price
     */
    public void Product(String id, String name, double price) {
        // TODO implement here
    }

    /**
     * @return
     */
    public abstract double calculateFinalPrice();

    /**
     * @return
     */
    public String getId() {
        // TODO implement here
        return "";
    }

    /**
     * @param id 
     * @return
     */
    public void setId(String id) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        // TODO implement here
        return null;
    }

}