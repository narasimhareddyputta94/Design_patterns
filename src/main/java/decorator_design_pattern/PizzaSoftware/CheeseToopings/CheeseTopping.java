package decorator_design_pattern.PizzaSoftware.CheeseToopings;

import decorator_design_pattern.PizzaSoftware.PizzaConstituents;

public class CheeseTopping implements PizzaConstituents {
    PizzaConstituents pizzaConstituents;

    public CheeseTopping(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 50;
    }

    @Override
    public String getDiscription() {
        return pizzaConstituents.getDiscription() + "Cheese ";
    }
}
