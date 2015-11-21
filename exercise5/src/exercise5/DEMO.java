package exercise5;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		
		System.out.println(o.toString());
		System.out.println("interesting");
		
		int a = -3;
		int b = +a;
		int c = -a;
		
		a = 3;
		b = ++a;
		c = a++;
		b = --a;
		c = a--;
		
		a = 2;
		b = a + 2;
		c = b - 2;
		a = c*2;
		b = a/2;
		c = b%2;
		
		a = 11;
		b = 22;
		
		boolean d = (a >= b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);

	}

}
