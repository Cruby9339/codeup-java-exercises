package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fileio {

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        //try to create the directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDir(FileDirectoryUtil.getPath("src", "fileIO", "files"));
        //Try to create the file
        path = Paths.get(path.toAbsolutePath().toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);
        // print out final location of file
        System.out.println(path.toAbsolutePath());
        IOUtil.tryPrintContents(path);
    }




}
