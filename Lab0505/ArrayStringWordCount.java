package Lab0505;
import java.util.*;

public class ArrayStringWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");
		String sentence = sc.nextLine();
		
		String word[] = sentence.split(" ");
		int l = word.length;
//		sc.close();
		int count =1;
		for(int i=0;i<l;i++) {		
			System.out.println(word[i]);
		}
		String check = sc.next();
		System.out.println();
		for(int i=0;i<l;i++) {
			if(check.compareToIgnoreCase(check)[i])
				count++;
				System.out.println(word[i]);
				System.out.println("Word is present");
		}
		System.out.println("Word Occured in String at"+count+" times" );
	}

}
