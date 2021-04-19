package week4day1;

public class Ex01 {

	class Customer{
		String id;
		String name;
		int age ;
		String grade;
		int point ;
		
		
	}
	public static void main(String[] args) {
		

		Customer s = new Customer();	// 공간확보
		s.id = "001";
		s.name = "kim";
		s.age = 32;	//공간에 값 대입
		s.grade = "vip";
		s.point = 5000;
		
		System.out.println(s.age);	//공간에 대입된 값 출력
		System.out.println(s.grade);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.point);
		
				
				
	}

}
