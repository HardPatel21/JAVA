package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Scanner;

public class FH_Stream {
    FileOutputStream fout = null;
    FileInputStream fin = null;
    Scanner sc = new Scanner(System.in);

    public void writeFile(String fileName, String folderPath) {
        if(folderPath == null) folderPath = "";
        try{
            fout = new FileOutputStream(folderPath + fileName + ".bin");
            System.out.println("Enter the data you want to write into " + fileName);
            byte[] data = sc.nextLine().getBytes();

            fout.write(data);
            fout.close();
            System.out.println("\n\nFile Written Successfully...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile(String fileName, String folderPath) {
        if(folderPath == null) folderPath = "";
        try{
            fin = new FileInputStream(folderPath + fileName + ".bin");
            int i = 0;
            while( (i = fin.read()) != -1) System.out.println((char)i);

            fin.close();
            System.out.println("\n\nEnd of File...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
