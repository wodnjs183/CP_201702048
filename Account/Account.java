package Account;
import java.util.Scanner;

public class Account {
	int accountNumber;
	String owner;
	int balance;
	int Account1=1000000;
	int Account2=0;
	
	void deposit(int amount) {
		balance -=amount;
	}
	void withdraw(int amount) {
		balance -=amount;
	}
	public String toString() {
		return "잔액" + balance;
	}
	public String transfer(int amount, Account otherAccount) {
		
		if(Account1 >= amount) {
			Account1 -=amount;
			otherAccount.Account2 +=amount;
			return "이체할 금액 :"+ amount;
		}
		else {
			return "잔액이 부족합니다";
		}
	}
	
	

}
