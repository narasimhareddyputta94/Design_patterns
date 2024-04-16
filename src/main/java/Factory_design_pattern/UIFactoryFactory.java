package Factory_design_pattern;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platform){
        switch (platform){
            case ANDROID:
                return new AndroidUIfactory();
            case IOS:
                return new IosUIFactory();
            default:
                return null;
        }
    }

}
