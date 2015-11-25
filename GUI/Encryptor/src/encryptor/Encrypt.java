/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptor;

/**
 *
 * @author FRESHIELD
 */
public class Encrypt {
	
	private char[] code = new char[26];
	
	public Encrypt()
	{
		setCode();
	}
	public Encrypt(String s)
	{
		code = s.toCharArray();
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
		char[] cs = s.toCharArray();
		
		int i,ci,d,m;
		
		char r;
		
		//Character cc;
		
		for(i = 0;i < cs.length; i ++)
		{
			if(cs[i] >= 97 && cs[i] <= 122)
			{
				ci = cs[i];
				
				m = ci - 97;
				
				cs[i] = code[m];
			}
		}
		/*
		for(i = 0;i < cs.length; i ++)
		{
			cc = new Character(cs[i]);
			
			rs = rs.concat(cc.toString());
		}
		*/

		String rs = new String(cs);
		
		return rs;
	}
	
	public String toDecode(String s)
	{
		char[] cs = s.toCharArray();
		
		int i,j;
		
		char r;
		
		//String rs = "";
		
		Character cc;
		
		for(i = 0;i < cs.length; i++)
		{
			if(cs[i] >= 97 && cs[i] <= 122)
			{
				for(j = 0;i <= code.length; j ++)
				{
					if(cs[i] == code[j])
					{
						cs[i] = (char)(j + 97);
						break;
					}
				}
			}
		}
		/*for(i = 0;i < cs.length; i++)
		{
			cc = new Character(cs[i]);
			
			rs = rs.concat(cc.toString());
		}
		*/

		String rs = new String(cs);
		
		
		return rs;
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
