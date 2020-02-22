package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Data;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Data data;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)" );
		char reposta = sc.next().charAt(0);
		if (reposta == 'y') {
			System.out.print("Enter intial deposit value: ");
			double initialDeposit = sc.nextDouble();
			data = new Data(numeroConta, titular, initialDeposit);
		}
		else {
			data = new Data(numeroConta, titular);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(data);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		data.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(data);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		data.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(data);
		
		sc.close();
	}

}
