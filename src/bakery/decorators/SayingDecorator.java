package bakery.decorators;

import bakery.cakes.Cake;

public class SayingDecorator extends CakeDecorator {
    
    private final String saying;

    public SayingDecorator(Cake decoratedCake, String saying) {
        super(decoratedCake);
        this.saying = saying;
    }

    @Override
    public int getCost() {
        return decoratedCake.getCost(); // Não altera o custo
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription() + " with saying \"" + saying + "\"";  // Adiciona "with saying 'X'" ao final
    }
}
