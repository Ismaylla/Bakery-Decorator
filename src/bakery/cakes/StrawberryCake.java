package bakery.cakes;

public class StrawberryCake extends Cake {
    @Override
    public String getDescription() {
        return "Strawberry cake";
    }

    @Override
    public int getCost() {
        return CAKE_COST * 2; // Dobro do custo padrão de Cake
    }
    
}