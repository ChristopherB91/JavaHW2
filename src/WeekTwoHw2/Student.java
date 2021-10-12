package WeekTwoHw2;
import java.util.Scanner;

public class Student extends Person {
	int stud_id;
	double subject1, subject2, subject3;
	String major;
	double average;
	
	

	Student(int id, String name, int age, char gender, double s1, double s2, double s3) {
		// We need to call the super() method in able to tell our child class that we want to inherit those properties from our parent.
		// super() calls the constructor class from our parent class. We need to pass on the parameters we need or else it's going to call on an empty constructor.
		// By using super(), compiler class automatically knows we are referring to the parent class. This is defined on our line 3 where we are extending our Student class with the parent class Person.
		super(name, age, gender);
		
		this.stud_id = id;
		this.subject1 = s1;
		this.subject2 = s2;
		this.subject3 = s3;
	}
	
	public void display() {
		
		System.out.println("Id: " + this.stud_id);
		super.display();
		System.out.println("Subject 1 score: " + this.subject1);
		System.out.println("Subject 2 score: " + this.subject2);
		System.out.println("Subject 3 score: " + this.subject3);
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
		System.out.println("What is your grade for Subj1?");
		double Subj1 = scan.nextDouble();
		System.out.println("What is your grade for Subj2?");
		double Subj2 = scan.nextDouble();
		System.out.println("What is your grade for Subj3?");
		double Subj3 = scan.nextDouble();
		scan.close();
		
		Student student1 = new Student(ID, Name, Age, Gender, Subj1, Subj2, Subj3);
		student1.display();
	}
	
}
