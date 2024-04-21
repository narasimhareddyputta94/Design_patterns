package decorator_design_pattern.IceCreamSoftware.Scoops;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class CandyScoop implements IceCream {
    IceCream iceCream;

    public CandyScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 25 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " Candy Scoop";
    }
}
