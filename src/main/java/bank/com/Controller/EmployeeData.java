package bank.com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bank.com.Service.DetailsofEmployee;
import bank.com.Service.PersonalInfoOfEmployee;
import bank.com.Service.ShowingDetails;

@RestController
public class EmployeeData
{
	@GetMapping("print/{type}")
 public String Employee( @PathVariable String type) 
 {
		DetailsofEmployee s= Factory.createObject(type);
	       s.EmployeeName();
	       s.EmployeeAge();
	       s.EmployeeAddress();
	       s.EmployeeGender();
	       s.EmployeeSalary();
	    return  s.EmployeeDepartment();
	     
 }
 
 }	
class Factory
{
	public static DetailsofEmployee createObject( String type) 
	{
		if (type.equals("male"))
		{
		PersonalInfoOfEmployee s= new PersonalInfoOfEmployee();
		return s;
		}
		
		if (type.equals("female"))
		{
		ShowingDetails s=new ShowingDetails();
		return s;	
	}
	return null;
}
	
}



