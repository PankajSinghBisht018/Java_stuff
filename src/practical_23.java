import java.io.FileWriter;
import java.io.IOException;

public class practical_23 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";
        String content = "Hello, world! This is a text written to a file.";

        try {
            // Create a FileWriter object with the specified file path
            FileWriter writer = new FileWriter(filePath);

            // Write the content to the file
            writer.write(content);

            // Close the FileWriter
            writer.close();

            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}


