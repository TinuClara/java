
import java.io.*;

public class copy {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFilePath = "3.txt"; // Replace with the path to your source file
        String destinationFilePath = "4.txt"; // Replace with the path to your destination file

        try {
            FileInputStream inputStream = new FileInputStream(sourceFilePath);
            FileOutputStream outputStream = new FileOutputStream(destinationFilePath);
            //byte[] buffer = new byte[4096];
            int i;

        
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


