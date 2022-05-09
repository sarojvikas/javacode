package Lab0505;



import java.util.Scanner;



public class StringWordCount {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter a Senetence");

		String sentence = sc.nextLine();

		System.out.println("Enter a word for checking");

		String word = sc.next();

		int count =0;

		for(int i=0;i<sentence.length();i++) {

			if(sentence.indexOf(word,i)==i) {

				count+=1;

				

			}

			

		}

		System.out.println("Word occured in String is: "+count);

		



	}



}
