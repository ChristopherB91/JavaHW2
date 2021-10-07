package WeekTwoHW1;

public class computerinfo {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		
		c1.setName("Inspiron 3583");
		c1.setYear(2018);
		c1.setCost(350);
		
		System.out.println(c1.getName());
		System.out.println("Year: " + c1.getYear());
		System.out.println("Cost: " + c1.getCost());

	}

}
