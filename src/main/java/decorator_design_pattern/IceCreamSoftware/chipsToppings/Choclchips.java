package decorator_design_pattern.IceCreamSoftware.chipsToppings;
import decorator_design_pattern.IceCreamSoftware.IceCream;

public class Choclchips implements IceCream{
    IceCream iceCream;
    public Choclchips(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return 10 + iceCream.getCost();
    }

    @Override
    public String getDiscription() {
        return iceCream.getDiscription() + " Choclchips";
    }
}
