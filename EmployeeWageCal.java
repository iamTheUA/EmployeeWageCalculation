package employee;
import java.util.Random;

public class EmployeeWageCal {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int Hour=0;
		int Wage=20;
		int MonthlyWage=0;
		for(int i=0; i<20; i++) {
			calHour();
			int DailyWage=Hour*Wage;
			MonthlyWage=MonthlyWage+DailyWage;
		}
	
	}
	
	static void calHour() {
		Random ran = new Random();
		int isPresent= ran.nextInt(3);
		int Hour=0;
		switch (isPresent) {
	    case 0:
	        Hour=0;
	        break;
	    case 1:
	        Hour=4;
	        break;
	    
	    case 2:
	        Hour=8;
	        break;
		}
	}
}
