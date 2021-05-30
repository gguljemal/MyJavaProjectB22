package day32_arrays_split;

public class AWSZones {

    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        String[] zoneSplit = zones.split(",");

        for (String eachZone : zoneSplit) {
            System.out.println("Deploying [" + app + "] to" + eachZone + "...");
        }
        System.out.println(zoneSplit.length);
    }
}
