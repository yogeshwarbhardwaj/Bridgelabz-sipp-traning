import java.io.*;

public class FileCopyPerformance {
    public static void main(String[] args) {
        String sourceFile = "largefile.bin"; // Replace with your large source file path
        String destFileUnbuffered = "dest_unbuffered.bin";
        String destFileBuffered = "dest_buffered.bin";

        // Buffer size of 4 KB
        int bufferSize = 4096;

        // Unbuffered streams copy
        long startTimeUnbuffered = System.nanoTime();
        copyFileUnbuffered(sourceFile, destFileUnbuffered, bufferSize);
        long endTimeUnbuffered = System.nanoTime();
        long durationUnbuffered = endTimeUnbuffered - startTimeUnbuffered;

        // Buffered streams copy
        long startTimeBuffered = System.nanoTime();
        copyFileBuffered(sourceFile, destFileBuffered, bufferSize);
        long endTimeBuffered = System.nanoTime();
        long durationBuffered = endTimeBuffered - startTimeBuffered;

        System.out.println("Unbuffered stream copy time: " + (durationUnbuffered / 1_000_000) + " ms");
        System.out.println("Buffered stream copy time: " + (durationBuffered / 1_000_000) + " ms");
    }

    private static void copyFileUnbuffered(String sourcePath, String destPath, int bufferSize) {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error during unbuffered copy: " + e.getMessage());
        }
    }

    private static void copyFileBuffered(String sourcePath, String destPath, int bufferSize) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath), bufferSize);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath), bufferSize)) {

            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error during buffered copy: " + e.getMessage());
        }
    }
}