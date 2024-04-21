package decorator_design_pattern.IceCreamSoftware.chipsToppings;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class vanillachips implements IceCream {
    IceCream iceCream;
    public vanillachips(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return 15 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " vanillachips";
    }
}
