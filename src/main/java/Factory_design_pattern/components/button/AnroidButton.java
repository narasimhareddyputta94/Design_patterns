package Factory_design_pattern.components.button;

public class AnroidButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Android button");
    }

    @Override
    public void onClick() {
        System.out.println("Android button clicked");
    }
}
