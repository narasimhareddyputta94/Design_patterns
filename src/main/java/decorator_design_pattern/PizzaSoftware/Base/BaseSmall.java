package decorator_design_pattern.PizzaSoftware.Base;

import decorator_design_pattern.PizzaSoftware.PizzaConstituents;


public class BaseSmall implements PizzaConstituents {
    PizzaConstituents pizzaConstituents;
    public BaseSmall(){

    }
    BaseSmall(PizzaConstituents pizzaConstituents){
        this.pizzaConstituents = pizzaConstituents;
    }
    @Override
    public int getCost() {
        if(pizzaConstituents != null){
            return pizzaConstituents.getCost() + 100;
        }
        return 100;
    }



    @Override
    public String getDiscription() {
        if(pizzaConstituents != null){
            return pizzaConstituents.getDiscription() + " with Base";
        }
        return "Base";
    }


}
