package pkg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {

    private final Path filePath;

    // Constructor
    public FileService(String data) {
        this.filePath = Path.of(data);
    }

    // Write to file (append mode)
    public void writeToFile(String content) throws IOException {
        Files.writeString(
                filePath,
                content + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    // Read entire file
    public String readFromFile() throws IOException {
        return Files.readString(filePath);
    }
}
