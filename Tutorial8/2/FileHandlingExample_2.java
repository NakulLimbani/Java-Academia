import java.io.*;

public class FileHandlingExample_2 {
    public static void main(String[] args) {
        // Create a File object
        File file = new File("example.txt");

        try {
            // Check if the file exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                // Create a new file
                file.createNewFile();
                System.out.println("File created successfully.");
            }

            // Write data to the file
            FileWriter writer = new FileWriter(file);
            writer.write("This is some text written to the file.");
            writer.close();

            // Read data from the file
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
