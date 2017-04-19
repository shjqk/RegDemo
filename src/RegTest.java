import java.util.prefs.Preferences;

public class RegTest
{
    public static void main(String[] args)
    {
        System.out.println("TEST");
        test();
        Preferences preferences = Preferences.systemRoot();
        String streTermInfo = preferences.get("eTermInfo", "");
        System.out.println(streTermInfo);
    }
    public static void test()
    {
        System.out.println("TEST2");
    }
}
