package randomKata;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindFileInDirs {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");
        System.out.println(findFile(path, "Main.java"));
    }

    public static Path findFile(Path folder, String fileToFind) throws IOException {
        if (Files.isDirectory(folder)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(folder)) {
                for (Path nextElem : stream) {
                    if (Files.isDirectory(nextElem)) {
                        Path foundFile = findFile(nextElem, fileToFind);
                        if (foundFile != null) {
                            return foundFile.toAbsolutePath();
                        }
                    } else {
                        if (nextElem.getFileName().toString().equals(fileToFind)) {
                            return nextElem.toAbsolutePath();
                        }
                    }
                }
            }
        }

        return null;
    }
}
