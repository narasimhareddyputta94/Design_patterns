package Factory_design_pattern;

public class Flutter {

    SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setTheme() {
        System.out.println("Setting Flutter theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting Flutter refresh rate");
    }

    public void setAnimation() {
        System.out.println("Setting Flutter animation");
    }

    public UIFactory createUIFactory() {
//        if (supportedPlatforms == SupportedPlatforms.ANDROID) {
//            return new AndroidUIfactory();
//        } else if (supportedPlatforms == SupportedPlatforms.IOS) {
//            return new IosUIFactory();
//        }
//        return null;
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }



}
