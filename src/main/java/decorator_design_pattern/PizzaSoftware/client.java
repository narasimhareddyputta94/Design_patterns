package decorator_design_pattern.PizzaSoftware;
import decorator_design_pattern.PizzaSoftware.Base.cheeseBaseLarge;
import decorator_design_pattern.PizzaSoftware.CheeseToopings.CheeseTopping;
import decorator_design_pattern.PizzaSoftware.NonCheeseToppings.ChickenTopping;
import decorator_design_pattern.PizzaSoftware.PizzaConstituents;
import decorator_design_pattern.PizzaSoftware.Base.BaseSmall;

public class client {
    public static void main(String[] args) {
        PizzaConstituents pizza = new CheeseTopping(new ChickenTopping(new cheeseBaseLarge()));
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Discription: " + pizza.getDiscription());

        PizzaConstituents pizza1 = new CheeseTopping(new BaseSmall());
        System.out.println("Cost: " + pizza1.getCost());
        System.out.println("Discription: " + pizza1.getDiscription());


    }
}
