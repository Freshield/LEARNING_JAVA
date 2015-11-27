package exercise27;

public class Superclass {
	
	public int superfield;
	
	public Superclass()
	{
		System.out.println("Superclass");
	}
	
	public void supermethod()
	{
		System.out.println("supermethod");
	}
	
	class Subclass extends Superclass
	{
		public int subfield;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
