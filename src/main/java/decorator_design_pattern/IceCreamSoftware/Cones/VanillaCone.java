package decorator_design_pattern.IceCreamSoftware.Cones;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class VanillaCone implements IceCream {
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDiscription() {
        return "Vanilla Cone";
    }
}
