package bakery.decorators;

import bakery.cakes.Cake;

public class MultiLayerDecorator extends CakeDecorator {

    public MultiLayerDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return cake.getCost() + 5; // Adiciona 5 ao custo total do bolo
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + cake.getDescription(); // Adiciona "Multi-layered" antes da descrição do bolo
    }
}
