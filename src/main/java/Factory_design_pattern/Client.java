package Factory_design_pattern;
import Factory_design_pattern.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();



    }
}
