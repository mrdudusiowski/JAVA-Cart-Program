package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Patryk Duduś
 */
public class Basket {

    private final List<Product> shopList = new ArrayList();

    public void addProduct(Product product) {
        if (product != null) {
            shopList.add(product);
        } else {
            throw new IllegalArgumentException("Product can't be null.");
        }
    }

    public void removeProduct(String name) {
        for (Iterator<Product> it = shopList.iterator(); it.hasNext();) {
            Product product = it.next();
            if (product.getName().equals(name)) {
                it.remove();
                break;
            }
        }
    }

    public double total() {
        double amount = 0;
        for (Product product : shopList) {
            amount += product.getPrice();
        }
        return amount;
    }

    public void showProducts() {
        for (Product product : shopList) {
            System.out.printf("Product: " + product.getName() + ", price is " + "%.2f", product.getPrice());
            System.out.println();
        }
    }

}
