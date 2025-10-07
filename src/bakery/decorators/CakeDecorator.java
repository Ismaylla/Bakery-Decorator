package bakery.decorators;

import bakery.cakes.Cake;

/**
 * Classe abstrata base para todos os decoradores de Cake.
 * 
 * Cada decorador "embrulha" outro bolo e delega as chamadas
 * de getCost() e getDescription() para ele, podendo adicionar
 * comportamento extra.
 */

public abstract class CakeDecorator extends Cake {
    
    protected Cake decoratedCake; // Referência ao bolo que está sendo decorado

    public CakeDecorator(Cake decoratedCake) {
        this.decoratedCake = decoratedCake;
    }

    @Override
    public int getCost() {
        
        return decoratedCake.getCost(); // Retorna o custo do bolo decorado
    }

    @Override
    public String getDescription() {
        
        return decoratedCake.getDescription(); // Retorna a descrição do bolo decorado
    }
}
