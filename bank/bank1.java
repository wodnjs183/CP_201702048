package bank;

public class bank1 {
	int accountNumber;
	String owner;
	int balance;
	int money;
	
	void deposit (int amount) {
		System.out.print("���¹�ȣ :" + accountNumber);
	}
	void withdraw (int amount) {
		System.out.print("������ :" + owner); 
	}
	public void set(int b) {
	balance = (int) b;
	System.out.print("�ܾ� :");
	}

}
