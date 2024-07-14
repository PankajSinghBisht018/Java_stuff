import java.io.File;
import java.io.IOException;

public class practical_22 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Create a File object
        File file = new File(filePath);

        try {
            // Create the file
            boolean fileCreated = file.createNewFile();

            if (fileCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}

