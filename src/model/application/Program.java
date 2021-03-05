package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		int number = Integer.parseInt(sc.nextLine());
		
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		
		System.out.print("Contract value: ");
		double totalValue = Double.parseDouble(sc.nextLine());
		
		Contract contract = new Contract(number, date, totalValue);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, number);
		
		System.out.println("Installments:");
		
		for (Installment x : contract.getInstallment()) {
			System.out.println(x);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
