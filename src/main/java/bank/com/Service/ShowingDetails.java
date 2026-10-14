package bank.com.Service;

public class ShowingDetails implements DetailsofEmployee
{

	@Override
	public String EmployeeName() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name");
		return "tina";
	}

	@Override
	public int EmployeeAge() {
		// TODO Auto-generated method stub
		System.out.println("Employee Age");
		return 20;
	}

	@Override
	public String EmployeeAddress() {
		// TODO Auto-generated method stub
		System.out.println("Employee Address");
		return "pcmc";
	}

	@Override
	public char EmployeeGender() {
		// TODO Auto-generated method stub
		System.out.println("Employee Gender");
		return 'f';
	}

	@Override
	public int EmployeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee Salary");
		return 10000;
	}

	@Override
	public String EmployeeDepartment() {
		// TODO Auto-generated method stub
		System.out.println("Employee Department");
		return "java developer";
	}

	
}
