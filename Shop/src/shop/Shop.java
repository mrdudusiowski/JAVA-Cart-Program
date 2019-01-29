package shop;

/**
 *
 * @author Patryk Duduś
 */
public class Shop {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addProduct(new Product("Butter", 2.5));
        basket.addProduct(new Product("Milk", 5));
        basket.addProduct(new Product("Chocolate", 3.5));
        try {
            basket.addProduct(new Product("X", 1.5));
        } catch (IllegalArgumentException ex) {
            System.err.println("Error! " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Unknow error!");
        }
        
        basket.showProducts();
        
        System.out.printf("Total is " + "%.2f", basket.total());
        System.out.println();
        
        basket.removeProduct("Milk");
        basket.showProducts();
        
        System.out.printf("Total is " + "%.2f", basket.total());
        System.out.println();
    }

}
