package Rectangle;
import java.util.Scanner;

public class Rectangele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 Rectangle = new Rectangle1();
		Scanner sc = new Scanner(System.in);
		System.out.print("����");
		Rectangle.w = sc.nextDouble();
		System.out.print("����");
		Rectangle.h = sc.nextDouble();
		System.out.println("���簢���� ���� :" + Rectangle.area());
		sc.close();

	}

}
