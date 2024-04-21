package decorator_design_pattern.IceCreamSoftware.Scoops;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class MangoScoop implements IceCream {
    IceCream iceCream;

    public MangoScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 20 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " Mango Scoop";
    }
}
