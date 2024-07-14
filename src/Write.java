
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Write {
    public static void main(String[] args) {
        File myfile = new File("pankaj.txt");
        try {
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter fileWriter = new FileWriter("pankaj.txt");
            fileWriter.write("pankaj");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
