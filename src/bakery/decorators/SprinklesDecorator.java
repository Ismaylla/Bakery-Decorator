package bakery.decorators;

import bakery.cakes.Cake;

public class SprinklesDecorator extends CakeDecorator {
    public SprinklesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return cake.getCost() + 2; // Adiciona 2 ao custo total
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";  // Adiciona "with sprinkles" ao final da descrição
    }
}
