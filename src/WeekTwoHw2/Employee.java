package WeekTwoHw2;

import java.util.Scanner;

public class Employee extends Person {
	int emp_id;
	double emp_salary;
	String emp_address;
	int emp_level;
	
	Employee(int id, String name, int age, char gender, double salary, String address, int level) {
		
		// We need to call the super() method in able to tell our child class that we want to inherit those properties from our parent.
		// super() calls the constructor class from our parent class. We need to pass on the parameters we need or else it's going to call on an empty constructor.
		// By using super(), compiler class automatically knows we are referring to the parent class. This is defined on our line 3 where we are extending our Student class with the parent class Person.
		super(name, age, gender);
		
		this.emp_id = id;
		this.emp_salary = salary;
		this.emp_address = address;
		this.emp_level = level;
	}
	public void display() {
		
		System.out.println("Id: " + this.emp_id);
		super.display();
		System.out.println("Employee Salary: " + this.emp_salary);
		System.out.println("Employee Address: " + this.emp_address);
		System.out.println("Employee level: " + this.emp_level);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Name?");
		String Name = scan.nextLine();
		System.out.println("What is your Age?");
		int Age = scan.nextInt();
		System.out.println("What is your Gender?");
		char Gender = scan.next().charAt(0);
		System.out.println("What is your ID?");
		int ID = scan.nextInt();
		System.out.println("What is your Salary?");
		double Salary = scan.nextDouble();
		scan.nextLine();
		System.out.println("What is your Address?");
		String Address = scan.nextLine();
		System.out.println("What is your Employee Level?");
		int Level = scan.nextInt();
		
		scan.close();
		
		Employee employee1 = new Employee(ID, Name, Age, Gender, Salary, Address, Level);
		
		employee1.display();
	}

}
