

public class EmployeeWageComputation {
	static int wagePerHr = 20;
	static int fullDayHr=8;
	static int partTimeHr=4;
	static int workDayPerMon=20;
	static int empCheck;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Progam");
		for(int i=0;i<=workDayPerMon;i++) {
		 empCheck = (int) Math.floor(Math.random() * 10) % 3;
		}
		System.out.println("Calculating Daily Employee Wages");
		
		switch(empCheck) {
		case 1:
			System.out.println(workDayPerMon*wagePerHr*fullDayHr);
			break;
		case 2:
			System.out.println(workDayPerMon*wagePerHr*partTimeHr);
			break;
		default:
			System.out.println("Employee is Absent");
		}
	}

}
