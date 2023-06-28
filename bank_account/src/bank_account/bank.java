package bank_account;
import java.util.Scanner;


public class bank {
	int acno;
	String name;
	String type;
	int bal;
	bankaccount()
	{
		System.out.println("deflut constructor is called");
	}
	bankaccount(int a,String b, String c,int d)
	{
		acno=a;
		name=b;
		type=c;
		bal=d;
	}
	void deposite(int a)
	{
		System.out.println("balence before deposite is"+bal);
		bal=bal+a;
		System.out.println("balence after depositise is"+bal);
	}
	void withdraw(int a)
	{
		System.out.println("balence before withdraw is "+bal);
		bal=bal-a;
		if(bal<0)
		{
			System.out.println("cannaot withdraw");
			bal=bal+a;
		}
		else
		{
			System.out.println("balence after withdraw is"+bal);	
		}
	}
	
		 void Display()
		 {
			 System.out.println("name is"+name);
			 System.out.println("balence is "+bal);
		 }
}
		 class bank1
		 {
			 public static void main(String args[])
			 {
				 bankaccount b= new bankaccount();
				 Scanner s=new Scanner(System.in);
				 System.out.println("entet acno,name,type,bal");
				 bankaccount ba=new
			bankaccount(s.nextInt(),s.next(),s.next(),s.nextInt());
				 System.out.println("enter theamount to be deposite");
				 ba.deposite(s.nextInt());
				 System.out.println("enter the amount to be withdraw");
				 ba.withdraw(s.nextInt());
				 ba.Display();
			 }
}
