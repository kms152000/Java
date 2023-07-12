package ch06.check;

public class Account {
	//19.
//	public static final int MIN_BALANCE = 0;
//	public static final int MAX_BALANCE = 1000000;
//	private int balance;
//	
//	public int getBalance() {
//		return balance;
//	}
//	public void setBalance(int balance) {
//		if(balance<Account.MIN_BALANCE || balance>Account.MAX_BALANCE){
//			return;
//		}
//		this.balance = balance;
//	}
	private String ano;
	private String owner;
	private int balance;
	
	public Account (String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
