package employee;
import java.util.Random;

public class EmployeeWageCal {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Random ran = new Random();
		int isPresent= ran.nextInt(2);
		if(isPresent==1) {
			System.out.println("Present");
		}
		else
			System.out.println("Absent");
		
		int Hour=8;
		int Wage=200;
		int DailyWage=Hour*Wage;
	}

}
