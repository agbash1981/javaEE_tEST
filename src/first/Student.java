package first;

public class Student {
	private String name;
	private int age;
	private String classes;
	
	
	// student unloaded constructor.
	public Student() {
		
	}

	// student loaded constructor.
	public Student(String name, int age, String classes) {
		
		this.name = name;
		this.age = age;
		this.classes = classes;
	}

	// getter method for getting string name.
	public String getName() {
		return name;
	}

	// setter for setting name of the student.
	public void setName(String name) {
		this.name = name;
	}

	// getter for student age.
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getClasses() {
		return classes;
	}


	public void setClasses(String classes) {
		this.classes = classes;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", classes=" + classes + "]";
	}


	public static void main(String[] args) {
		

	}

}
