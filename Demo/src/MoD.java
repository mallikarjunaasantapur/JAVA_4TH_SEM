
public class MoD {
		//Method overriding.
		int i, j;
		MoD (int a, int b)
		{
			i = a;
			j = b;
		
}
		//display i and j
		void show()
		{
			System.out.println("i and j: " + i + " " + j);
		}
	}
	class B extends MoD
	{
		int k;
		B(int a, int b, int c)
		{
			super(a,b);
			k = c;
		}
		//display k – this overrides show() in A
		void show()
		{
			super.show();
			System.out.println("k: " + k);
		}
	}
	class Override
	{
		public static void main(String args[])
		{
			B subOb = new B(1, 2, 3);
			subOb.show(); // this calls show() in B
		}
	}
