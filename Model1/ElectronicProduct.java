
import java.util.*;

/**
 * 
 */
public class ElectronicProduct extends Product implements Discountable {

    /**
     * Default constructor
     */
    public ElectronicProduct() {
    }

    /**
     * 
     */
    private int warrantyMonths;

    /**
     * @return
     */
    public double calculateFinalPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param percent 
     * @return
     */
    public void applyDiscount(double percent) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @param name 
     * @param price 
     * @param warrantyMonths
     */
    public void ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        // TODO implement here
    }

    /**
     * @return
     */
    public abstract double calculateFinalPrice();

    /**
     * @param percent 
     * @return
     */
    public void applyDiscount(double percent) {
        // TODO implement here
        return null;
    }

}