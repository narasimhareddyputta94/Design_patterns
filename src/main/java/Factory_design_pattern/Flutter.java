package Factory_design_pattern;

public class Flutter {
    public void setTheme() {
        System.out.println("Setting Flutter theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting Flutter refresh rate");
    }

    public void setAnimation() {
        System.out.println("Setting Flutter animation");
    }

    public UIFactory createUIFactory(SupportedPlatforms platform) {
        if (platform == SupportedPlatforms.ANDROID) {
            return new AndroidUIfactory();
        } else{
            return new IosUIFactory();
        }
    }


}
