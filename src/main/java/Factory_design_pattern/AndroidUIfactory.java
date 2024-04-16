package Factory_design_pattern;

import Factory_design_pattern.components.button.AnroidButton;
import Factory_design_pattern.components.button.Button;
import Factory_design_pattern.components.button.IosButtom;
import Factory_design_pattern.components.dropDown.AndroidDropDown;
import Factory_design_pattern.components.dropDown.DropDown;
import Factory_design_pattern.components.dropDown.IosDropDown;
import Factory_design_pattern.components.menu.AndroidMenu;
import Factory_design_pattern.components.menu.IosMenu;
import Factory_design_pattern.components.menu.Menu;

public class AndroidUIfactory implements UIFactory{


    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public AnroidButton createButton() {
        return new AnroidButton();
    }
}
