class First
{
	public void display(String msg)
	{
		System.out.print("["+msg);
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.print("]");
	}
}
class Second extends Thread
{
	First fobj;
	String msg;
	Second(First fp,String msg)
	{
		fobj = fp;
		this.msg = msg;
		start();
	}
	public void run() 
	{
		synchronized(fobj) 
		{
			fobj.display(msg);
		}
	}
}
public class multithr 
{
	public static void main(String[] args) 
	{
		First fnew = new First();
		Second s1 = new Second(fnew,"welcome");
		Second s3 = new Second(fnew,"java");
		Second s2 = new Second(fnew,"to");
		
	}
}
