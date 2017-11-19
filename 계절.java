
import java.util.*;
public class 계절 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하시오:");
		month = sc.nextInt();
		switch ( month ) {
		case 1 : case 2 : case 3 :
			System.out.println("겨울");
			break;
		case 4 : case 5: case 6:
			System.out.println("봄");
			break;
		case 7 : case 8 : case 9:
			System.out.println("여름");
			break;
			
		}

	}

}
