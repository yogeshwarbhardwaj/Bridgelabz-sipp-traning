import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";  // Replace with your source file path
        String destinationFile = "destination.txt"; // Replace with your destination file path

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File source = new File(sourceFile);
            if (!source.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            fis = new FileInputStream(source);
            fos = new FileOutputStream(destinationFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File has been copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred during file operations: " + e.getMessage());
        } finally {
            // Close the streams in finally block to ensure they are closed even if an exception occurs
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file streams: " + e.getMessage());
            }
        }
    }
}