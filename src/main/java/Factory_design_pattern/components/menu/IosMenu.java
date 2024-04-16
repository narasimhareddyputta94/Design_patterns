package Factory_design_pattern.components.menu;

public class IosMenu implements Menu {

    public void CreateMenu() {
        System.out.println("Creating Ios menu");
    }

    public void SetMenuColor() {
        System.out.println("Setting Ios menu color");
    }

    public void SetMenuFont() {
        System.out.println("Setting Ios menu font");
    }

    public void SetMenuSize() {
        System.out.println("Setting Ios menu size");
    }



}
