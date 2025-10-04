package bakery;

import bakery.cakes.ChocolateCake;
import bakery.cakes.VanillaCake;
import bakery.order.Order;

public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new VanillaCake());
        order.addCake(new ChocolateCake());

        // Print the order
        order.printOrder();
    }
}
