package week4day1;
class Customer3{
	private String id;
	private String name;
	private String grade;
	private int age ;
	private int point ;
	
	public Customer3() {
		
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	public String getInfo() {
		return id + " " + name + " "+age +" " +grade +" "+point ;
	}
}


public class Ex03 {

	public static void main(String[] args) {
		

		Customer3 c = new Customer3();
		c.setId("001"); //set통해서 값 대입하는 방법
		c.setName("kim");
		c.setAge(32);
		c.setGrade("vip");
		c.setPoint(5000);
		
		System.out.println(c.getInfo());
	}

}
