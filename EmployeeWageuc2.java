public class EmployeeWageuc2 {
 public static void main(String[] args) {
	int Emp_present = 1;
    int Wage_per_hour = 20;
	int Full_day_hour = 8;
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if (empcheck == Emp_present) {
	 int Total_Salary = (Wage_per_hour * Full_day_hour);
	System.out.println("Total_Salary" +Total_Salary);
	}
	 else{
		 System.out.println("Salary is 0");
	 }
 }
}