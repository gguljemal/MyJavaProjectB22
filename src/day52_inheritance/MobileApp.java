package day52_inheritance;

public class MobileApp {

    String name;
    double version;

    public void useTheApp(int minutes) {
        System.out.println("Using " + name + " app for " + minutes + " minutes");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }


}
