package exercise9;

public class DEMO {

	private int a;
	
	public void seta(int p1)
	{
		a = p1;
	}
	
	public int geta()
	{
		return a;
	}
	
	public int dosomething(int p1)
	{
		return a + p1;
	}
	
	int dosomething1()
	{
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DEMO d = new DEMO();
		
		d.seta(11);
		
		System.out.println(d.geta());
		System.out.println(d.dosomething(1));
		System.out.println(d.dosomething1());
		

	}

}
