import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical_24 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        try {
            // Create a FileReader object with the specified file path
            FileReader fileReader = new FileReader(filePath);

            // Create a BufferedReader object to read from the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the contents of the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

