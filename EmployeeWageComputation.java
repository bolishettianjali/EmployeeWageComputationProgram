
public class EmployeeWageComputation {
	static int wagePerHr = 20;
	static int fullDayHr=8;
	static int partTimeHr=4;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Progam");
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("Calculating Daily Employee Wages");
		if(empCheck==1) {
			System.out.println(wagePerHr*fullDayHr);
		}
		else if(empCheck==2) {
			System.out.println(wagePerHr*partTimeHr);
		}

		else {
			System.out.println("Employee is Absent");
		}
	}

}