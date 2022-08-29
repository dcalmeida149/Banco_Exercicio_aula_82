package application;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import entities.account;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String continua;
		account account;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit: ");
			double incialDeposit = sc.nextDouble();
			account = new account(number, holder, incialDeposit);
		} else {
			account = new account(number, holder);
		}

		do {
			System.out.printf("\n %s", account);

			System.out.printf("\n\nEtender deposit value: ");
			double deposit = sc.nextDouble();
			account.deposit(deposit);
			System.out.printf("\n\n Account balance: %.2f%n", account.getBalance());
			
			System.out.printf("\n\nEtender withdraw value: ");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.printf("\n\n Account balance: %.2f%n", account.getBalance());
			
			System.out.printf("\n\ncontinue? y/n :");
			continua = sc.next();
		} while (Objects.equals(continua, "y") || Objects.equals(continua, "Y"));
		
		System.out.printf("\n\n %s", account);

		sc.close();
	}

}
