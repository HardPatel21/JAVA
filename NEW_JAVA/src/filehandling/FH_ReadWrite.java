package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FH_ReadWrite {
    FileWriter fout = null;
    FileReader fin = null;
    Scanner sc = new Scanner(System.in);

    public void writeFile(String fileName, String folderPath) {
        if(folderPath == null) folderPath = "";
        try{
            fout = new FileWriter(folderPath + fileName + ".txt");
            System.out.println("Enter the data you want to write into " + fileName);
            String data = sc.nextLine();
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
            fin = new FileReader(folderPath + fileName + ".txt");
            int i = 0;
            while( (i = fin.read()) != -1) System.out.println((char)i);

            fin.close();
            System.out.println("\n\nEnd of File...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}