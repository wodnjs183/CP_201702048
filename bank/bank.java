package bank;
import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 Bank = new bank1();
		Scanner sc = new Scanner(System.in);
		System.out.println("�����1");
		System.out.print("���¹�ȣ:");
		Bank.accountNumber = sc.nextInt();
		System.out.print("������:");
		Bank.owner = sc.next();
		System.out.print("�ʱ��ܾ�:");
		Bank.balance = sc.nextInt();
		
		System.out.println("�����2");
		System.out.print("���¹�ȣ:");
		Bank.accountNumber = sc.nextInt();
		System.out.print("������:");
		Bank.owner = sc.next();
		System.out.print("�ʱ��ܾ�:");
		Bank.balance = sc.nextInt();
		
		System.out.print("�۱��� �ݾ� :");
		Bank.money = sc.nextInt();
		
		

	}

}
