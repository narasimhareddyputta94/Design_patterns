package Factory_design_pattern.components.dropDown;

public class AndroidDropDown implements DropDown {

    public void CreateDropDown() {
        System.out.println("Creating Android menu");
    }

    public void SetDropDownColor() {
        System.out.println("Setting Android menu color");
    }

    public void SetDropDownFont() {
        System.out.println("Setting Android menu font");
    }

    public void SetDropDownSize() {
        System.out.println("Setting Android menu size");
    }
}
