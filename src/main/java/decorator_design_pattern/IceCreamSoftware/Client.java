package decorator_design_pattern.IceCreamSoftware;

import decorator_design_pattern.IceCreamSoftware.Cones.AlcholCone;
import decorator_design_pattern.IceCreamSoftware.Cones.BlueBeeryCone;
import decorator_design_pattern.IceCreamSoftware.Cones.CannabisCone;
import decorator_design_pattern.IceCreamSoftware.Cones.VanillaCone;
import decorator_design_pattern.IceCreamSoftware.FruitToopings.StrawBerry;
import decorator_design_pattern.IceCreamSoftware.chipsToppings.Choclchips;
import decorator_design_pattern.IceCreamSoftware.chipsToppings.vanillachips;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new CannabisCone();
        System.out.println(iceCream.getDiscription() + " Cost: " + iceCream.getCost());

        IceCream iceCream1 = new Choclchips(new VanillaCone());
        System.out.println(iceCream1.getDiscription() + " Cost: " + iceCream1.getCost());

        IceCream iceCream2 = new vanillachips(new Choclchips(new BlueBeeryCone()));
        System.out.println(iceCream2.getDiscription() + " Cost: " + iceCream2.getCost());

        IceCream iceCream3 = new StrawBerry(new vanillachips(new Choclchips(new AlcholCone())));
        System.out.println(iceCream3.getDiscription() + " Cost: " + iceCream3.getCost());



    }
}
