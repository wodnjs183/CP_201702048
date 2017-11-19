package Rectangle;
import java.util.Scanner;

public class Rectangele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 Rectangle = new Rectangle1();
		Scanner sc = new Scanner(System.in);
		System.out.print("가로");
		Rectangle.w = sc.nextDouble();
		System.out.print("세로");
		Rectangle.h = sc.nextDouble();
		System.out.println("직사각형의 넓이 :" + Rectangle.area());
		sc.close();

	}

}
