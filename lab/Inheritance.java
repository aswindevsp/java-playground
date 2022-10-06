/*
class Employee 
	name, age, phone no, address and salaray
	methord printSalray
Officer and manager
inherits employee 
officer -> speiclization
manager -> department
*/
import java.util.Scanner;

class Employee{
	String name;
	int age;
	String phoneNo;
	String address;
	float salary;
		
	void printSalary() {
		System.out.println("Salary: " + salary);
	} 
}
	
class Officer extends Employee {
	String specilization;
}
	
class Manager extends Employee {
	String department;
}


public class Inheritance{
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Officer a = new Officer();
		Manager b = new Manager();
		
		a.name = "Arjun";
		a.age = 25;
		a.phoneNo = "9876543210";
		a.address = "Kochi";
		a.salary = 234234;
		a.specilization = "Backend";
		
		b.name = "Kiran";
		b.age = 26;
		b.phoneNo = "9876543310";
		b.address = "Kochi";
		b.salary = 634234;
		b.department = "Reserach";
		
		System.out.println("Name: " + a.name);
		System.out.println("Age: " + a.age);
		System.out.println("Phone No: " + a.phoneNo);
		System.out.println("Address: " + a.address);
		System.out.println("Salary: " + a.salary);
		System.out.println("Specilization: " + a.specilization);
		
		System.out.println();
		
		System.out.println("Name: "+ b.name);
		System.out.println("Age: " + b.age);
		System.out.println("Phone No: " + b.phoneNo);
		System.out.println("Address: " + b.address);
		System.out.println("Salary: " + b.salary);
		System.out.println("Department: " + b.department);
	} 

}
