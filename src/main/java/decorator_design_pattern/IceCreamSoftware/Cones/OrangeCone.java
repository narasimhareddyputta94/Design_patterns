package decorator_design_pattern.IceCreamSoftware.Cones;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class OrangeCone implements IceCream {
    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getDiscription() {
        return "Orange Cone";
    }
}
