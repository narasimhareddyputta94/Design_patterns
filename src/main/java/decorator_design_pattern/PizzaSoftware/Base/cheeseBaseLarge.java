package decorator_design_pattern.PizzaSoftware.Base;

import decorator_design_pattern.PizzaSoftware.PizzaConstituents;

public class cheeseBaseLarge implements PizzaConstituents {


    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDiscription() {
        return "Cheese Large Base";
    }
}
