package decorator_design_pattern;

public class Base implements PizzaConstituents{
    PizzaConstituents pizzaConstituents;
    Base(){

    }
    Base(PizzaConstituents pizzaConstituents){
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
