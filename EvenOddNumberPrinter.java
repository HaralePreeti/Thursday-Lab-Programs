
public class EvenOddNumberPrinter extends Thread{

	public void run() {
		System.out.println("Even numbers is between 1 to 100 :");
		for(int i=1; i<=100;i++) {
			
			if(i%2==0) {
				// checking Even condition.
				System.out.print(i +" ");
				
			}
		}
		System.out.println("\nOdd numbers is between 1 to 100 :");
		for(int j=1; j<=100;j++) {
			
			if(j%2!=0) {
				// checking Odd condition.
				System.out.print(j +" ");
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		EvenOddNumberPrinter obj=new EvenOddNumberPrinter();
		obj.start();

	}
}