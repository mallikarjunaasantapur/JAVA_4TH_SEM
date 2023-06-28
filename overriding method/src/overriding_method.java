
public class overriding_method {
	int i,j;
	overriding_method(int a,int b)
	{
		i=a;
		j=b;
	}
	void show()
	{
		System.out.println("i and j:"+i+""+j)
		
	}
	class B extends overriding_method
	{

}
