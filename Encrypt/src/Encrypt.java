
public class Encrypt {
	
	private char[] code = new char[26];
	
	public Encrypt()
	{
		setCode();
	}
	
	public void setCode()
	{
		char c = 'a';
		
		for(int i = 0;i<26;i++)
		{
			code[i]=c++;
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
		Encrypt e = new Encrypt();
		
		System.out.println(e.code);
		
		String s = "There is no spoon";
		
		System.out.println(s);
		
		String s1 = e.toEncode(s);
		
		System.out.println(s1);
		
		String s2 = e.toDecode(s1);
		
		System.out.println(s2);

	}

}
