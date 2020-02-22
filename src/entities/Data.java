package entities;

public class Data {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public Data(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public Data(int numeroConta, String titular, double initialDeposit) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposit(initialDeposit);
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}	
	
	public void deposit(double amount) {
		saldo +=amount;
	}
	
	public void withdraw(double amount) {
		saldo -=amount+5.0;
	}
	
	public String toString() {
		return "Account "+numeroConta+", Holder: "+titular+", Balance: $ "+String.format("%.2f%n", saldo);
	}
}
