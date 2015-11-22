package exercise12;

public class exercise12 {
	
	private static int a = 0;
	
	private int b;
	
	public static double test()
	{
		return ((double)a / 10);
	}
	
	public exercise12()
	{
		a ++;
		b = 0;
	}
	
	public void dosomething()
	{
		a++;
		b++;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(exercise12.a);
		
		exercise12.a ++;

		System.out.println(exercise12.a);
		
		exercise12 d = new exercise12();
		
		int p1 = exercise12.a;
		
		System.out.println(p1);
		
		System.out.println(d.b);
		
		d.a ++;
		
		double p2 = exercise12.test();
		
		System.out.println(p2);
		
		exercise12 e = new exercise12();
		
		System.out.println(e.a);
		
		p2 = exercise12.test();
		
		System.out.println(p2);
		
		System.out.println(d.a);
		
		d.dosomething();

		System.out.println(d.a);

		System.out.println(e.a);

		e.dosomething();

		System.out.println(d.a);

		System.out.println(e.a);
		
		
		

	}

}
