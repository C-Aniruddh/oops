package aniruddh;

import java.io.*;

/**
 * Created by Aniruddh on 23-10-2017.
 */
public class Buffer {
    public void useBuffer() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("path to input file"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("path to output file"));
        int i;
        do {
            i = br.read();
            if (i != -1) {
                if (Character.isLowerCase((char) i))
                    bw.write(Character.toUpperCase((char) i));
                else if (Character.isUpperCase((char) i))
                    bw.write(Character.toLowerCase((char) i));
                else
                    bw.write((char) i);
            }
        } while (i != -1);
        br.close();
        bw.close();

        System.out.println("Operation Complete : Buffer");
    }
}
