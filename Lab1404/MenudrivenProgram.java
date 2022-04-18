package Lab1404;
import java.util.*;

public class MenudrivenProgram{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do{
			System.out.println("Select your Option 1 to 7");
			int choice = sc.nextInt();
			switch(choice){
			case 1 :
				System.out.println("Monday");
				break;
			case 2 :
				System.out.println("Tuesday");
				break;
			case 3 :
				System.out.println("Wednesday");
				break;
			case 4 :
				System.out.println("Thursday");
				break;
			case 5 :
				System.out.println("Friday");
				break;
			case 6 :
				System.out.println("Weekend");
				break;
			case 7 :
				System.out.println("Weekend");
				break;
			case 8 :
				exit = true;
				System.out.println("Thank you");
			default:
				System.out.println("You have selected a wrong option");
			}
		}while(exit==false);
	}
}
// Output
/*
 	Select your Option 1 to 7
1
Monday
Select your Option 1 to 7
6
Weekend
Select your Option 1 to 7
10
You have selected a wrong option
Select your Option 1 to 7
8
Thank you
You are selected wrong option	
 */
