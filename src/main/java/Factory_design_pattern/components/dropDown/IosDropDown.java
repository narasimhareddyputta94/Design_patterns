package Factory_design_pattern.components.dropDown;

public class IosDropDown implements DropDown {

    public void CreateDropDown() {
        System.out.println("Creating Ios drop down");
    }

    public void SetDropDownColor() {
        System.out.println("Setting Ios drop down color");
    }

    public void SetDropDownFont() {
        System.out.println("Setting Ios drop down font");
    }

    public void SetDropDownSize() {
        System.out.println("Setting Ios drop down size");
    }
}
