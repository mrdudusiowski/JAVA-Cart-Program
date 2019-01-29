package shop;

/**
 *
 * @author Patryk Dudus
 */
public class Product {

    private String name;
    private double price;

    Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    final void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Wrong name.");
        }
    }

    final void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Wrong price.");
        }
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}
