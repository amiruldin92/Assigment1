/**
 * @(#)Yourname2.java
 *
 *
 * @author
 * @version 1.00 2016/3/28
 */

import java.io.*;
import java.nio.file.*;
//import.java.util.*;
//import.java.util.Scanner;


public class Yourname2 {


    	 public static void main(String[] args) throws IOException{

    	 	try{

    			Path fileIn = Paths.get("Yourname.txt");
   			 	String fileout = "Yourname.bin";
    			byte[] buffer = Files.readAllBytes(fileIn);


    			FileOutputStream outputStream = new FileOutputStream(fileout);
    			outputStream.write(buffer);
    			outputStream.close();

    			System.out.println("Wrote " + buffer.length + " bytes");
    	 	}


    	 	catch(IOException ex) {
    	 		Path fileIn = Paths.get("Yourname.txt");
    	 		byte[] buffer = Files.readAllBytes(fileIn);
            	System.out.println("can't open " + fileIn);
    	 	}
    	 }
    }



