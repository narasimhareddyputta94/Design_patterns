package decorator_design_pattern.IceCreamSoftware.Cones;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class CannabisCone implements IceCream {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDiscription() {
        return "Cannabis Cone";
    }
}
