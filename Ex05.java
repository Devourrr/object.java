package week4day1;

public class Ex05 {

	public static void main(String[] args) {
		
		Customer2 c1 = new Customer2("id001","kim",32,"vip",5000);
		Customer2 c2 = new Customer2("id002","lee",25,"vvip",1000);
		Customer2 c3 = new Customer2("id003","park",35,"silver",8000);

		String result1 = c1.getInfo();
		String result2 = c2.getInfo();
		String result3 = c3.getInfo();
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
