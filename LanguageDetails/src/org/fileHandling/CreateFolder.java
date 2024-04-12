package org.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFolder {

//	//go to search and type file Explorer and open this pc . inside that you find greensTech folder
	public static void main(String[] args) throws IOException {
	//create folder
		File f = new File("C:\\GreensTech\\FileOperations");
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
//	Create new file and write the file with some 10 lines of text.*/
		File fa =  new File("C:\\GreensTech\\FileOperations\\Sample.txt");
		boolean a = fa.createNewFile();
		System.out.println("new file created "+a);
	//to write in file
		FileWriter fw = new FileWriter(fa);
		PrintWriter pw = new PrintWriter(fw);
		pw.write("hello world\n");
		pw.append("java selenium\n", 0,12);
		pw.write("hello Milwaukee\n");
		pw.append("java development\t", 0,12);
		pw.append("GreensTechnology", 0,16);
		pw.write("hello how  are you .just writing to have some content in my sample file\n");
		pw.write("this is a new line\n");
		pw.write("bye sample\n");
		pw.close();
	//to retrive data from file
		Scanner sc = new Scanner(fa);  //it will scan each line in file
		while (sc.hasNextLine()) {			
			System.out.println(sc.nextLine());
		}
	//to Print all the available files from an existing folder.
		File allFile = new File("C:\\");
		String[] list = allFile.list();
		for (String newname : list) {
			System.out.println(newname);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
