package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {
    public static void main(String[] args) {
        byte[] videoBytes;
        Path sourcePath = Paths.get("/Users/anastasiospapargyropoulos/Desktop/codingfactory4/Images/Paris.png");
        Path targetPath = Paths.get("/Users/anastasiospapargyropoulos/Desktop/codingfactory4/Images/Paris1.png");

        try {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, videoBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
