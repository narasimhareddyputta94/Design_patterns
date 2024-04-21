package decorator_design_pattern.IceCreamSoftware.FruitToopings;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class Mnago implements IceCream {
    IceCream iceCream;
    public Mnago(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return 30 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " Mnago";
    }
}
