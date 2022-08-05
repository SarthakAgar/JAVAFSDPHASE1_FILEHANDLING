package projectphase_1;

import java.io.File;
import java.util.Scanner;
public class Displaythefiles {
void displayfile() {
	// public static void main(String[] args) throws IOException {
		String path="C:\\Users\\SARTHAK AGARWAL\\Documents\\finalrpophase_1\\";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the filename to search");
//		String filename=sc.next();
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}

}
