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
		

		Customer s = new Customer();	// ����Ȯ��
		s.id = "001";
		s.name = "kim";
		s.age = 32;	//������ �� ����
		s.grade = "vip";
		s.point = 5000;
		
		System.out.println(s.age);	//������ ���Ե� �� ���
		System.out.println(s.grade);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.point);
		
				
				
	}

}
