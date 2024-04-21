package decorator_design_pattern.IceCreamSoftware.Scoops;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class ChoclateScoop implements IceCream {
    IceCream iceCream;

    public ChoclateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 10 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " Choclate Scoop";
    }
}
