public class Animal {
	private static int currentYear = 2023;
	
	private String name;
	private int birthYear;
	
	public Animal(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public Animal(String name) {
		this.name = name;
		birthYear = currentYear; // why is this not this.birthYear
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBirthYear() {
		return birthYear; // why is this not this.birthYear
	}
	
	public int getAge() {
		currentYear - birthYear; // why is this not this.birthYear
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int year) {
		this.birthYear = year;
	}
	
	
	public void talk() {
		System.out.println(this.getName() + "don't talk!");
	}
	
	public void eat() {
		
	}
	
	public static void main() {
		
	}
}
//one class is a class of another class aggregation public zoo class 
