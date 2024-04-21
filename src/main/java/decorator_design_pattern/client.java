package decorator_design_pattern;

public class client {
    public static void main(String[] args) {
        PizzaConstituents pizza = new CheeseTopping(new ChickenTopping(new Base()));
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Discription: " + pizza.getDiscription());
    }
}
