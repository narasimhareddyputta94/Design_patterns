package Factory_design_pattern.components.menu;

public class AndroidMenu implements Menu {

    public void CreateMenu() {
        System.out.println("Creating Android menu");
    }

    public void SetMenuColor() {
        System.out.println("Setting Android menu color");
    }

    public void SetMenuFont() {
        System.out.println("Setting Android menu font");
    }

    public void SetMenuSize() {
        System.out.println("Setting Android menu size");
    }
}
