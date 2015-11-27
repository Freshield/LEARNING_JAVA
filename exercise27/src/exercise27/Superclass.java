package exercise27;

class Super {
	
	public int superfield;
	
	public Super()
	{
		System.out.println("Superclass");
	}
	
	public void supermethod()
	{
		System.out.println("supermethod");
	}
}
	
class Subclass extends Super
	{
		public int subfield;
		
		public Subclass()
		{
			System.out.println("Subclass");
		}
		
		public void submethod()
		{
			System.out.println("submethod");
		}
	}
	
	
public class Superclass
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subclass demo = new Subclass();
		
		demo.submethod();
		

	}
}


