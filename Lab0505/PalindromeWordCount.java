package Lab0505;



import java.util.Scanner;



public class PalindromeWordCount {

	
	static int CheckPalin(String str) {

		//String org = str;

		String rev ="";

		int l=str.length();		

		for(int i=l-1;i>=0;i--) {

			rev = rev+str.charAt(i);

		}

		if(rev.equalsIgnoreCase(str))

			return 1;

		else

			return 0;

	}



	public static void main(String[] args) {

			// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();

		String word[]= sentence.split(" ");

		int sum =0;

		for(int i=0;i<word.length;i++) {

			if(PalindromeWordCount.CheckPalin(word[i])==1) {

				sum=sum+1;

				System.out.println("Palindrome "+word[i]);

			}

//			else

//				System.out.println("Not a Plaindrome");

		}

		System.out.println("Total palindrome occure in given String is: "+sum);

	}



}
