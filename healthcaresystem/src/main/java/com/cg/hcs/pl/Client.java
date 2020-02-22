package com.cg.hcs.pl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.hcs.bean.DiagnosticCenter;
import com.cg.hcs.bean.Test;
import com.cg.hcs.exception.HealthException;
import com.cg.hcs.service.HealthService;
import com.cg.hcs.service.HealthServiceImpl;

public class Client {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HealthService healthservice=new HealthServiceImpl();
//		DiagnosticCenter dc=new DiagnosticCenter();
		ArrayList<Test>listofTests =new ArrayList<Test>();
		int choice=0;
		Test test=new Test();
		
		while(choice!=4)
		{
		
		System.out.println("1.Add Test");
		System.out.println("2.Remove Test");
		System.out.println("Enter choice");
		choice = scanner.nextInt();
		switch(choice)
		{
	case 1:
		scanner.nextLine();
		System.out.println("Select center name");
		String centerName=scanner.nextLine();
		
		 System.out.println("Enter test name");
		 String TestName=scanner.nextLine();
		test=new Test();
		 
		test.setTestName(TestName);
		
		try 
		{
	
		 String sid= healthservice.addTest(centerName,
				 test);
	 System.out.println("Test Id = "+sid);
		
		}
	catch (HealthException e)
		{
		System.err.println(e.getMessage());
		}
		break;
		
		
		case 2:
		System.out.println("Enter Test Id");
		String TestId=scanner.nextLine();
		TestId=scanner.nextLine();
		test.setTestName(TestId);
		try {
		boolean sid= healthservice.removeTest(test);
		System.out.println("Test Id = "+sid);
		System.out.println("test deleted");
		}
		catch (HealthException e) {
		System.err.println(e.getMessage());
		}
	   return;  
		
		}
		}
		}
	}


