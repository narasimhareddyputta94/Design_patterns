package decorator_design_pattern;

public class BeefTopping implements PizzaConstituents{
    private PizzaConstituents pizzaConstituents;

    public BeefTopping(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 50;
    }

    @Override
    public String getDiscription() {
        return pizzaConstituents.getDiscription() + " with Beef Topping";
    }
}
