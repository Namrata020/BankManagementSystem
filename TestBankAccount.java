package com.test;
import com.code.AcType;
import com.code.BankAccount;
import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		for(AcType a: AcType.values())
			System.out.println(a);
		System.out.println("Enter A/C details:acctNo,  iFSC,  customerName,  acctType,  balance ");
		BankAccount account=new BankAccount(sc.nextInt(),sc.next(),sc.next(),AcType.valueOf(sc.next().toUpperCase()),sc.nextDouble());
		System.out.println("A/C summary: "+account);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("After error continuation....");
		
		
		
		
	}
}
