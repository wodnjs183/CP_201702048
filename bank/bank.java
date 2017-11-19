package bank;
import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 Bank = new bank1();
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자1");
		System.out.print("계좌번호:");
		Bank.accountNumber = sc.nextInt();
		System.out.print("예금주:");
		Bank.owner = sc.next();
		System.out.print("초기잔액:");
		Bank.balance = sc.nextInt();
		
		System.out.println("사용자2");
		System.out.print("계좌번호:");
		Bank.accountNumber = sc.nextInt();
		System.out.print("예금주:");
		Bank.owner = sc.next();
		System.out.print("초기잔액:");
		Bank.balance = sc.nextInt();
		
		System.out.print("송금할 금액 :");
		Bank.money = sc.nextInt();
		
		

	}

}
