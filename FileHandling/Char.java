package aniruddh;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Aniruddh on 23-10-2017.
 */
public class Char {
    public void useChar() throws IOException{
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("path to input file");
            outputStream = new FileWriter("path to output file");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }

            System.out.println("Operation Complete : Char by Char");
        }
    }
}
