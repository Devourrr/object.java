package week4day1;

class Person {
	String name;
	public Person(String name) {
		this.name = name;
		
	}
	public Person() {
		
	}
}

class Doctor extends Person {
	
	int doctorId;
	
//	public Doctor(int doctorId) {
//		super("±Ë¿«ªÁ");
//		this.doctorId;
//		
	public Doctor(String name, int doctorId) {
		super(name);
		this.doctorId = doctorId;
	}
	}


public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor d = new Doctor ("±Ë¿«ªÁ",10001);
	}

}
