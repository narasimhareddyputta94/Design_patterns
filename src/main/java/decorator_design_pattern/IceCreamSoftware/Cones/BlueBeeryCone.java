package decorator_design_pattern.IceCreamSoftware.Cones;

import decorator_design_pattern.IceCreamSoftware.IceCream;

public class BlueBeeryCone implements IceCream {
    @Override
    public int getCost() {
        return 60;
    }

    @Override
    public String getDiscription() {
        return "BlueBeery Cone";
    }
}
