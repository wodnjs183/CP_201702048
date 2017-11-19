package Account;
import java.util.Scanner;

public class Account1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("홍길동잔액:1000000");
		
		Account me = new Account();
		Account you = new Account();
		
		System.out.print("이체할 금액:");
		int amount = sc.nextInt();
		System.out.println(me.transfer(amount, you));
		
		System.out.println("홍길동 남은 액수 :" +me.Account1);
		System.out.println("김철수 받은 액수:" +you.Account2);

	}

}
