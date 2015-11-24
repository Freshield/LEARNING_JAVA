
public class Encrypt {
	
	private char[] code = new char[26];
	
	public Encrypt()
	{
		setCode();
	}
	
	public void setCode()
	{
		int a = 0;
		int b = 0;
		
		do
		{

			a = (int)(Math.random()*10);
			
			b = (int)(Math.random()*10);
			
		}while(a % 2 == 0);
		
		
		System.out.println(a);
		System.out.println(b);
		
		int x,y,m,i;
		
		char c = 'a';
		
		for(i = 0;i<26;i++)
		{
			x = c;
			
			y = x * a + b;
			
			m = y % 26;
			
			code[i] = (char)(m + 97);
			
			c ++;
			
		}
	}
	
	public char[] getCode()
	{
		return code;
	}
	
	public String toEncode(String s)
	{
		return s;
	}
	
	public String toDecode(String s)
	{
		return s;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<16;i++)
		{
			Encrypt e = new Encrypt();
			
			System.out.println(e.code);
		}
		
		/*
		String s = "There is no spoon";
		
		System.out.println(s);
		
		String s1 = e.toEncode(s);
		
		System.out.println(s1);
		
		String s2 = e.toDecode(s1);
		
		System.out.println(s2);
		*/
	}

}
