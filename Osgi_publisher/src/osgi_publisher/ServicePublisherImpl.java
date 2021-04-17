package osgi_publisher;

import java.util.Scanner;

public class ServicePublisherImpl implements ServicePublisher{

	public ServicePublisherImpl() {
		
	}
	private String b;
	private String address;
	private String phonenumber;
	private String email;
	private int a = 0;
	private int distance = 0;
	private int remain;
	

	@Override
	public void add() {
		
		//User Inputs
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter Name - ");
		b = sc.nextLine();
		System.out.print("Enter Address - ");
		address = sc.nextLine();
		System.out.print("Enter phone number - ");
		phonenumber = sc.nextLine();
		System.out.print("Enter email address - ");
		email = sc.nextLine();
		//System.in is a standard input stream  
		System.out.print("Enter km - ");
		 
		try {
			a= Integer.parseInt(sc.nextLine());
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Input Error");
		}
		 
		
		if(a < distance) {
			
			remain = distance - a;
			System.out.println("Rs"+"."+(a * 100 + remain * 10));
			
		}else {
			
			System.out.println("Rs"+"."+a * 100);
		}
			
	}
	
	
	
	
}
