
public class Teacher1 implements Person1 {

	public void speak() {
		//Teacher speak method.
		System.out.println("This is Teacher Speak method..");
	}
	
	public static void main(String[] args) {
		Teacher1 obj1=new Teacher1();
		obj1.speak();
	}

}