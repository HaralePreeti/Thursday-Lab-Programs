public class Student1 implements Person1 {

	@Override
	public void speak() {
		//Student speak method.
		System.out.println("This is Student Speak method..");
	}
	
	public static void main(String[] args) {
		
		Student1 obj=new Student1();
		obj.speak();
	}

}