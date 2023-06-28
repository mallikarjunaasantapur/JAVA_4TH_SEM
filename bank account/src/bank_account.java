import java.util.Scanner;
public class bank_account {
	int accno;
	String name;
	String type;
	int bal;
     bank_account()
	{
		System.out.println("default constructor is called");
		
	}
	bank_account(int a,String b,String c,int d)
	{
		accno=a;
		name=b;
		type=c;
		bal=d;	
	}
	void deposit(int a)
	{
		System.out.println("balance before deposit is"+bal);
		bal=bal+a;
		System.out.println("balance after deposit is"+bal);
	
		
	}
	void withdraw(int a)
	{
		System.out.println("balance before withdrawal is"+bal);
		bal=bal-a;
		if(bal<0)
		{
			System.out.println("cannot withdraw");
			bal=bal+a;
		}
		else
			System.out.println("balance after withdrawal is"+bal);
	}
	void display()
	{
		System.out.println("name is"+name);
		System.out.println("balance is"+bal);
		
	}
}
class Bank1
{
	public static void main(String args[])
	{ 
		bank_account b=new bank_account();
		Scanner s=new Scanner(System.in);
		System.out.println("enter accno,name,type,bal");
		bank_account ba=new
		bank_account(s.nextInt(),s.next(),s.next(),s.nextInt());
		System.out.println("enter the amount to deposit");
		ba.deposit(s.nextInt());
		System.out.println("enter the amount to wiuthdraw");
		ba.withdraw(s.nextInt());
		ba.display();
		
		
		
	}

		

}

