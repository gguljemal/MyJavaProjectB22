package day52_inheritance;

public class Discord extends MobileApp {

    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on Discord");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }

    @Override
    public boolean download() {
        System.out.println("Downloaded Discord 0.0.23 from App Store");
        return true;
    }

    public void printInfo() {
        System.out.println("App name is ==> " + getName());
        System.out.println("App Version ==> " + getVersion());
    }
}
