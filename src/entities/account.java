package entities;

public class account {
	private int number;
	private String holder;
	private double balance;

	public account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	public account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount + 5.00;
	}
}
