package bakery.decorators;

import bakery.cakes.Cake;

public class SprinklesDecorator extends CakeDecorator {
    public SprinklesDecorator(Cake decoratedCake) {
        super(decoratedCake);
    }

    @Override
    public int getCost() {
        return decoratedCake.getCost() + 2; // Adiciona 2 ao custo total
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription() + " with sprinkles";  // Adiciona "with sprinkles" ao final da descrição
    }
}
