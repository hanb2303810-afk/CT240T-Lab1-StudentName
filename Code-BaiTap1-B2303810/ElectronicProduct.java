
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
    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.10;
    }



    /**
     * @param id 
     * @param name 
     * @param price 
     * @param warrantyMonths
     */
    public  ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    /**
     * @param percent 
     * @return
     */
    @Override
    public void applyDiscount(double percent) {
        setPrice(getPrice() - getPrice() * percent / 100);
    }

}