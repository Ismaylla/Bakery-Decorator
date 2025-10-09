package bakery.decorators;

import bakery.cakes.Cake;

public class SayingDecorator extends CakeDecorator {
    
    private final String saying;

    public SayingDecorator(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public int getCost() {
        return cake.getCost(); // Não altera o custo
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying \"" + saying + "\"";  // Adiciona "with saying 'X'" ao final
    }
}
