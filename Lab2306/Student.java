package Lab2306;

public class Student {
	int id;
	String name;
	String sub ;
	int tot_marks;
	
	public Student(int id, String name, String sub, int tot_marks) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
		this.tot_marks = tot_marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sub=" + sub + ", tot_marks=" + tot_marks + "]";
	}
	
	
		
	
	

}
