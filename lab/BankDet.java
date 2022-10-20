import java.util.Scanner;


class Account{
	String name;
	String accountNo;
	float balance = 0;
	
	void display() {
		System.out.println("Account No: " + accountNo);
		System.out.println("Account Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println();
	}
}

class Bank extends Account{
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		System.out.println();
	}
	void withDraw(float amount){
		try {
			if((balance - amount) < 1000) {
				throw new Exception("Not enought minimum balance left to withdraw");
			} else {
				System.out.println("withdrawn " + amount);
				balance -= amount;
				System.out.println("Current Balance: " + balance);
				System.out.println();
			}
		} catch(Exception e) {
			System.out.println(e);
			System.out.println();
		}
	}
	void deposit(float amount) {
		balance += amount;
		System.out.println(amount + " deposited");
		System.out.println("Current Balance: " + balance);
		System.out.println();
		System.out.println();
	}
}


public class BankDet {

	public static void main(String []args) {
		Bank p1 = new Bank();
		p1.accountNo = "238407693332";
		p1.name = "Kiran";
		p1.balance = 1500;
		Scanner input = new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("1. Display Account Details ");
			System.out.println("2. Check Balance");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.print("Enter Choice: ");
			choice = input.nextInt();
			System.out.println();
			
			switch(choice) {
				case 1:
					p1.display();
					break;
				case 2:
					p1.checkBalance();
					break;
				case 3:
					System.out.print("Deposit amount: ");
					p1.deposit(input.nextFloat());
					break;
				case 4:
					System.out.print("Withdraw amount: ");
					p1.withDraw(input.nextFloat());
					break;
			}
		}
	}
}
