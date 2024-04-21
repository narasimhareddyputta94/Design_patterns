package Factory_design_pattern;
import Factory_design_pattern.components.button.Button;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        button.render();

        flutter = new Flutter(SupportedPlatforms.IOS);
        uiFactory = flutter.createUIFactory();
        button = uiFactory.createButton();
        button.render();

//        flutter = new Flutter(SupportedPlatforms.WEB);
//        uiFactory = flutter.createUIFactory();
//        button = uiFactory.createButton();
//        button.render();



    }
}
