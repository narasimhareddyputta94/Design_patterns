package decorator_design_pattern.IceCreamSoftware.FruitToopings;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class StrawBerry implements IceCream {
    IceCream iceCream;
    public StrawBerry(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return 20 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " StrawBerry";
    }
}
