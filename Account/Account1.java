package Account;
import java.util.Scanner;

public class Account1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ȫ�浿�ܾ�:1000000");
		
		Account me = new Account();
		Account you = new Account();
		
		System.out.print("��ü�� �ݾ�:");
		int amount = sc.nextInt();
		System.out.println(me.transfer(amount, you));
		
		System.out.println("ȫ�浿 ���� �׼� :" +me.Account1);
		System.out.println("��ö�� ���� �׼�:" +you.Account2);

	}

}
