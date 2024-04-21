package decorator_design_pattern.IceCreamSoftware.Cones;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class ChoclateCone implements IceCream {
    @Override
    public int getCost() {
        return 40;
    }

    @Override
    public String getDiscription() {
        return "Choclate Cone";
    }
}
