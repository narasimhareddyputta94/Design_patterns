package Factory_design_pattern;

import Factory_design_pattern.components.button.Button;
import Factory_design_pattern.components.button.IosButtom;
import Factory_design_pattern.components.dropDown.DropDown;
import Factory_design_pattern.components.dropDown.IosDropDown;
import Factory_design_pattern.components.menu.IosMenu;
import Factory_design_pattern.components.menu.Menu;

public class IosUIFactory implements UIFactory{

    public IosMenu createMenu(){
        return new IosMenu();
    }

    public IosDropDown createDropDown(){
        return new IosDropDown();
    }

    public IosButtom createButton(){
        return new IosButtom();
    }

}
