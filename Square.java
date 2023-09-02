import java.util.Scanner;

public class Square{
	public int square(int a){
	return a * a;
	}
	public float square(float a){
	return a * a;
	}
	public static void main(String[]args){
		Square s = new Square();
		System.out.print("Input Integer Number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("Input Double Number : ");
		float y = sc.nextFloat();
		System.out.println("Square of "+x+" is "+s.square(x));
		System.out.println("Square of "+y+" is "+s.square(y));
		System.out.println("Square of integer("+y+") is " + s.square((int) y));
		System.out.println("Square of double("+x+") is " +s.square((float) x));
	}
}