package decorator_design_pattern.IceCreamSoftware.Cones;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class AlcholCone implements IceCream {
    @Override
    public int getCost() {
        return 70;
    }

    @Override
    public String getDiscription() {
        return "Alchol Cone";
    }
}
