package week4day1;

public class Ex06 {

	public static void main(String[] args) {
		Customer2[] customers = new Customer2[3];
		
	
		customers[0] = new Customer2("id001","kim",32,"vip",5000);
		customers[1] = new Customer2("id002","lee",25,"vip",2000);
		customers[2] = new Customer2("id003","park",35,"vip",8000);

		for(int i=0; i< customers.length; i++) {
			System.out.println(customers[i].getInfo());
			
		}
	}

}
