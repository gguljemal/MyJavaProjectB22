package day61_exceptions_collections.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {

    public static void main(String[] args) {

        String filePath = "src/day61_exceptions_collections/checked_exceptions/data.txt";
        List<String> data = null;

        try {
            data = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String each : data) {
            System.out.println(each);
        }
        System.out.println("--- THE END ---");
    }
}
