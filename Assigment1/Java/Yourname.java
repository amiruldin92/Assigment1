/**
 * @(#)Yourname.java
 *
 *
 * @author
 * @version 1.00 2016/3/27
 */
package textfiles;


import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Yourname {
	public static void main(String [] args ) {

		String fileName = "Yourname.txt";
		Scanner in = new Scanner(System.in);
		FileWriter out = null;

		String name = null;
        String address = null;

try{

		FileWriter fileWriter =
                new FileWriter(fileName);

		 //String name;
		 System.out.print("Your Name:");
		 name  = in.nextLine();

		 //String address;
		 System.out.print("Your Address:");
		 address = in.nextLine();

		 System.out.println("Hi " + name + ", how is the weather at " + address + " ?" );



		}
catch(IOException ex){
	System.out.println(
                "Error writing to file '"
                + fileName + "'");
}

 try {
            out = new FileWriter("Yourname.txt");
            out.write("Your name: "+ name);
            out.write(System.lineSeparator());
            out.write("Address: "+ address);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Yourname.class.getName()).log(Level.SEVERE, null, ex);
        }
	}



}