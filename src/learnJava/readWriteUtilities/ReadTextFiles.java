package learnJava.readWriteUtilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFiles {

    public static void main(String[] args) {
        ReadTextFiles rtf = new ReadTextFiles();
        rtf.readFiles();
    }

    String systemPath = System.getProperty("user.dir");
    String relativePath = "/src/learnJava/readWriteUtilities/Test.txt";
    String path = systemPath + relativePath;

    FileReader fileReader;
    BufferedReader bufferedReader;

    void readFiles() {
        String data;
        try {
            fileReader = new FileReader(path); //Insert the location of the file in the constructor argument
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
