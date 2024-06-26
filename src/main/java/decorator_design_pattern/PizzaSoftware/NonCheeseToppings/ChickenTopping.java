package decorator_design_pattern.PizzaSoftware.NonCheeseToppings;

import decorator_design_pattern.PizzaSoftware.PizzaConstituents;

public class ChickenTopping implements PizzaConstituents {
    PizzaConstituents pizzaConstituents;

    public ChickenTopping(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 50;
    }

    @Override
    public String getDiscription() {
        return pizzaConstituents.getDiscription() + " with Chicken Topping";
    }
}
