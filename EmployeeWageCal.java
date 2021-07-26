package employee;
import java.util.Random;

public class EmployeeWageCal {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Random ran = new Random();
		int isPresent= ran.nextInt(3);
		int Hour=0;		
		if (isPresent==2) {
			Hour = 8;
		}
		else if(isPresent==1) {
			Hour = 4;
		}
		else {
			Hour = 0;
		}
		
		int Wage=20;
		int DailyWage=Hour*Wage;
	}

}
