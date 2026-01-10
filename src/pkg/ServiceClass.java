package pkg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ServiceClass {

    private Path path;

    // Constructor
    public ServiceClass(String fileName) {
        this.path = Path.of(fileName);
    }

    // Write file (overwrite)
    public void writeFile() {
        try {
            Files.writeString(path,
                    "Java File I/O Example\n" +
                    "Using NIO API\n" +
                    "Name: Layan\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Append to file
    public void appendToFile() {
        try {
            Files.writeString(
                    path,
                    "\nAppended line",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read file
    public void readFile() {
        try {
            String content = Files.readString(path);
            System.out.println("File content:");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
