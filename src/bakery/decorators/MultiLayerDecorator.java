package bakery.decorators;

import bakery.cakes.Cake;

public class MultiLayerDecorator extends CakeDecorator {

    public MultiLayerDecorator(Cake decoratedCake) {
        super(decoratedCake);
    }

    @Override
    public int getCost() {
        return decoratedCake.getCost() + 5; // Adiciona 5 ao custo total do bolo
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + decoratedCake.getDescription(); // Adiciona "Multi-layered" antes da descrição do bolo
    }
}
