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
	
	Employee(String name, int age, String phoneNo, String address, float salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}
	void printSalary() {
		System.out.println("Salary: " + salary);
	} 
}
	
class Officer extends Employee {
	String specilization;
	Officer(String name, int age, String phoneNo, String address, float salary, String specilization) {
		super(name, age, phoneNo, address, salary);
		this.specilization = specilization;
	}
}
	
class Manager extends Employee {
	String department;
	
	Manager(String name, int age, String phoneNo, String address, float salary, String department) {
		super(name, age, phoneNo, address, salary);
		this.department = department;
	}
}


public class superClass{
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Officer a = new Officer("Arjun", 26, "9876544321", "Kochi", 3452345, "Backend");
		Manager b = new Manager("Kiran", 30, "7012398712", "Kochi", 2342343, "Research");
			
		System.out.println("Name: " + a.name);
		System.out.println("Age: " + a.age);
		System.out.println("Phone No: " + a.phoneNo);
		System.out.println("Address: " + a.address);
		a.printSalary();
		System.out.println("Specilization: " + a.specilization);
		
		System.out.println();
		
		System.out.println("Name: "+ b.name);
		System.out.println("Age: " + b.age);
		System.out.println("Phone No: " + b.phoneNo);
		System.out.println("Address: " + b.address);
		b.printSalary();
		System.out.println("Department: " + b.department);
	} 

}
