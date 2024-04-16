package Factory_design_pattern.components.button;

public class IosButtom implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Ios button");
    }

    @Override
    public void onClick() {
        System.out.println("Ios button clicked");
    }
}
