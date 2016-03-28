/**
 * @(#)Yourname3.java
 *
 *
 * @author
 * @version 1.00 2016/3/28
 */

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;



public class Yourname3 {

	public static void main(String[] args) throws IOException{


	String filein = "Yourname.bin";
    Path fileout = Paths.get("Last.txt");
    String allwords = "";
    byte[] buffer = new byte[100];
	FileInputStream inputStream = new FileInputStream(filein);
    int total = 0;
    int nRead = 0;


    while((nRead = inputStream.read(buffer)) != -1) {
        String thisBuffer = new String(buffer);
        allwords = allwords + thisBuffer;
        total += nRead;
    }

    inputStream.close();
    System.out.println("Read " + total + " bytes");
    System.out.println("Words read: " + allwords);


    byte data[] = allwords.getBytes();
    OutputStream out = new BufferedOutputStream(Files.newOutputStream(fileout, CREATE));
    out.write(data, 0, data.length);
    out.close();
  }
}

