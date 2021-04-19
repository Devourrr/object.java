package week4day1;

class Customer2{
		private String id;
		private String name;
		private String grade;
		private int age ;
		private int point ;
		
		public Customer2() {
			
		}
		
		public Customer2(String id, String name, int age, String grade, int point) {
			this.age = age;
			this.grade = grade;
			this.id = id;
			this.name = name;
			this.point = point;
		}
		
		public String getInfo() {
			return id + " " + name + " "+age +" " +grade +" "+point ;
		}
	}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer2 s = new Customer2();
		Customer2 s1 = new Customer2("001","vip",32,"kim",5000);
		System.out.println(s1.getInfo());
	}

}
