package Factory_design_pattern;
import java.util.*;
import Factory_design_pattern.components.*;
import Factory_design_pattern.components.menu.Menu;
import Factory_design_pattern.components.dropDown.DropDown;
import Factory_design_pattern.components.button.Button;

public interface UIFactory {

    public Menu createMenu();

    public DropDown createDropDown();

    public Button createButton();




}
