
import java.util.*;
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		month = sc.nextInt();
		switch ( month ) {
		case 1 : case 2 : case 3 :
			System.out.println("�ܿ�");
			break;
		case 4 : case 5: case 6:
			System.out.println("��");
			break;
		case 7 : case 8 : case 9:
			System.out.println("����");
			break;
			
		}

	}

}
