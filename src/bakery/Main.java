package bakery;

import bakery.cakes.*;
import bakery.order.Order;
import bakery.decorators.*; 

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        // Chocolate cake → simples
        Cake chocolateSimple = new ChocolateCake();
        order.addCake(chocolateSimple);

        // Vanilla cake com saying "PLAIN!"
        Cake vanillaPlain = new SayingDecorator(new VanillaCake(), "PLAIN!");
        order.addCake(vanillaPlain);

        // Vanilla cake com sprinkles + saying "FANCY!"
        Cake vanillaFancy = new SayingDecorator(new SprinklesDecorator(new VanillaCake()) ,"FANCY!");
        order.addCake(vanillaFancy);

        // Strawberry cake:
        // Multi-layered → Sprinkles duplo → Dois sayings ("One of" e "EVERYTHING")
        Cake strawberryCrazy = new SayingDecorator(new SayingDecorator(new SprinklesDecorator(new SprinklesDecorator(new MultiLayerDecorator(new StrawberryCake()))) ,"One of") ,"EVERYTHING");
        order.addCake(strawberryCrazy);

        order.printOrder();
    }
}
