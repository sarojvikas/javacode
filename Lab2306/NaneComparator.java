package Lab2306;

import java.util.Comparator;

public class NameComparator implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareToIgnoreCase(o2.name);
	}
	
	

}
