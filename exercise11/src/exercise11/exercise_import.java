package exercise11;

public class exercise_import {

	
	private int a;
	
	public exercise_import(int p1)
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


}

