package Lab2306;



import java.util.Arrays;



public class MainStudent {



	public static void main(String[] args) 
  {








		

		Student obj1 = new Student(52, "Vikas", "English", 65);

		Student obj2 = new Student(73, "Suresh", "Biology", 73);

		Student obj3  = new Student(65, "Dharmesh", "Maths", 56);

		Student obj4 = new Student(89, "Riya", "Chemistry", 95);

		Student obj5 = new Student(11, "Shreya", "Physics", 78);

		

		

		Student [] arr = { obj1 , obj2, obj3, obj4, obj5};

		

		Arrays.sort(arr, new NameComparator());

		

      for(Student s : arr) {

			System.out.println(s+" ");

		}

		

		

		System.out.println("\n from Marks Sort");

		Arrays.sort(arr, new TotalMarksComparator());

		

		for(Student v : arr) {

			System.out.println(v+" ");

		}

		

	}



}
