package week5day1object;

class Student {

	int id;
	int kor;
	int eng;
	int tot;
	
	public Student() {}
	public Student(int id, int kor, int eng) {
		this.id = id;
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return id+  " " + kor + " " + eng;
	}
	@Override
	public boolean equals(Object obj) {
		
		Student tmp = (Student)obj;
		if(this.id == tmp.id) {
			return true;
			
		}else return false;
	}
}

public class Ex03{
	public static void main(String[]args) {
		Student s = new Student(101,90,80);
		System.out.println(s); //s.toString();
		
		Student s1 = new Student(101,100,80);
		
		boolean result = s.equals(s1);
		System.out.println(result);
	
	}
}
