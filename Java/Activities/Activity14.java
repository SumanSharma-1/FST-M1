package session3;

import java.io.IOException;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:/Users/0533D6744/eclipse-workspace/fst-m1-java03/src/main/resources/Test.txt");

            File fileUtil = FileUtils.getFile("C:/Users/0533D6744/eclipse-workspace/fst-m1-java03/src/main/resources/Test.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            File destDir = new File("resources");
            FileUtils.copyFileToDirectory(file, destDir);

            File newFile = FileUtils.getFile(destDir, "Test.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
		
