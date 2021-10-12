package WeekTwoHw2;

import java.util.Scanner;

public class Person1 {

	private int age;
	private String name;
	private String gender;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Name");
		String Name = scan.nextLine();
		System.out.println("What is your Age");
		int Age = scan.nextInt();
		scan.nextLine();
		System.out.println("What is your Gender");
		String Gender = scan.nextLine();
		
		Person1 p1 = new Person1();
		p1.setName(Name);
		p1.setAge(Age);
		p1.setGender(Gender);
		
		
		System.out.println("Name: "+ p1.getName());
		System.out.println("Age: " + p1.getAge());
		System.out.println("Gender: " + p1.getGender());
		scan.close();
	}
}
