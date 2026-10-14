package bank.com.Service;

public class PersonalInfoOfEmployee implements DetailsofEmployee
{

	@Override
	public String EmployeeName() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name");
		return "bob";
	}

	@Override
	public int EmployeeAge() {
		// TODO Auto-generated method stub
		System.out.println("Employee Age");
		return 23;
	}

	@Override
	public String EmployeeAddress() {
		// TODO Auto-generated method stub
		System.out.println("Employee Address ");
		return "pune";
	}

	@Override
	public char EmployeeGender() {
		// TODO Auto-generated method stub
		System.out.println("Employee Gender");
		return 'm';
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
		return "Software testing";
	}

}
