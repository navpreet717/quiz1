//NAVPREET KAUR REG NO. C0748674
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instructors infected in number of weeks
		Scanner keyboard=new Scanner(System.in);
		System.out.println(" the number of weeks you want to calculate the infection rate for peter comes");
		int weeks=keyboard.nextInt();
		
		//declare variable
		int days=weeks*7;
		int infectedInstructor=0;
		//calculate how many instructors are infected aFTER peter 
		for(int i=2;i<=days;i-=2){
			 infectedInstructor=infectedInstructor+1;
			
		}

		
		//
		// output the total number of infected instructors
		
		
		
		int Total=infectedInstructor+1;
		
		System.out.println("The total NUMBER OF INSTRUCTOR INFECTED :"+Total);
		

	}


}


















