package decorator_design_pattern.IceCreamSoftware.FruitToopings;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class Blueberry implements IceCream {
    IceCream iceCream;
    public Blueberry(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return 25 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " Blueberry";
    }
}
