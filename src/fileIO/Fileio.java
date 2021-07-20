package fileIO;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

        // Try to write to the file
        IOUtil.tryWriteToFile(getContent(), path);

        //Try to print contents of file
        IOUtil.tryPrintContents(path);
        System.out.println("hello");

    }

    public static List<String> getContent(){
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("This is another line!");
        contentToWrite.add("Another NOTHER line!");

        return contentToWrite;
    }


}
