package exercise10;

public class DEMO {
	
	private int a;
	
	public DEMO(int p1)
	{
		seta(p1);
	}
	
	public void seta(int a)
	{
		this.a = a;
	}
	
	public int geta()
	{
		return a;
	}
	
	public int dosomething(int a)
	{
		return this.a + a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DEMO d = new DEMO(10);
		
		System.out.println(d.geta());
		System.out.println(d.dosomething(1));

	}

}
