package decorator_design_pattern.IceCreamSoftware.Nuts;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class Cashews implements IceCream {
    IceCream iceCream;
    public Cashews(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return 25 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " Cashews";
    }
}
