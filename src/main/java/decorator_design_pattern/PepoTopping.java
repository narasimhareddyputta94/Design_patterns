package decorator_design_pattern;

public class PepoTopping implements PizzaConstituents{
    PizzaConstituents pizzaConstituents;

    public PepoTopping(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 50;
    }

    @Override
    public String getDiscription() {
        return pizzaConstituents.getDiscription() + " with Pepo Topping";
    }
}
