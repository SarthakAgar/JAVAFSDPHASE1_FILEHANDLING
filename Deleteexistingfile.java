package projectphase_1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Deleteexistingfile {
	void deletefile() {
//	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\SARTHAK AGARWAL\\Documents\\finalrpophase_1\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
		
	}

}

