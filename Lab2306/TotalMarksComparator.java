package Lab2306;



import java.util.Comparator;



public class TotalMarksComparator implements Comparator<Student>{



	@Override
	public int compare(Student o1, Student o2) {

		// TODO Auto-generated method stub

		return o1.tot_marks-o2.tot_marks;

	}



}
