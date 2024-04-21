package decorator_design_pattern.IceCreamSoftware.Nuts;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class CrushedBadam implements IceCream {
    IceCream iceCream;
    public CrushedBadam(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return 30 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " CrushedBadam";
    }
}
