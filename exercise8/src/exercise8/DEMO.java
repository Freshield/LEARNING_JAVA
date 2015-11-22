package exercise8;

public class DEMO {
	
	int a;
	
	public int dosomething(int p1)
	{
		return a + p1;
	}
	
	public double dosomething(double p1)
	{
		return a + p1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DEMO d = new DEMO();
		
		d.a = 11;
		
		System.out.println(d.dosomething(5));
		System.out.println(d.dosomething(7.2));
		

	}

}
