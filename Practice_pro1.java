package projectphase_1;
import java.io.IOException;
import java.util.Scanner;

public class Practice_pro1 {
	public static void main(String[] args) throws IOException
	{
   Scanner sc = new Scanner(System.in);
   Addnewfile a =new Addnewfile();

   Deleteexistingfile del=new Deleteexistingfile(); 
   Searchfromfile s = new Searchfromfile(); 
   Displaythefiles d=new Displaythefiles();
	while(true) {
		System.out.println("------------FILE HANDLING PROJECT-------------");
		System.out.println("enter your option main switch case");
        int option1  =sc.nextInt(); 
		switch(option1) {

		case 1: d.displayfile(); break;

		case 2: while(true) {

		System.out.println("enter your option for sub switch case");

		int option2 =sc.nextInt();
		switch(option2){

		case 1:a.addfile(); break;
		case 2:del.deletefile(); break;

		case 3:s.searchfile(); break; 
		case 4:System.exit(0);

		}

		} 
		case 3:break;

		}
	}
  }
}
