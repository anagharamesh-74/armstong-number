package assignment;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		int a =2, b= 10 ,c=5;
		if(a<=b && a<=c) {
		
			System.out.println("a"+"is the smallest number");
		}
		else if(b<=c && b<=a) {
        System.out.println("b"+"is the smallest number");
		}
		else {
			System.out.println("c"+"is the smallest number");
		}
		

	}

}
