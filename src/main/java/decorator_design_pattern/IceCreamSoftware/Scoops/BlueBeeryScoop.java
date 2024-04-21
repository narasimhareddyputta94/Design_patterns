package decorator_design_pattern.IceCreamSoftware.Scoops;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class BlueBeeryScoop implements IceCream {
    IceCream iceCream;

    public BlueBeeryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 15 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " BlueBeery Scoop";
    }
}
