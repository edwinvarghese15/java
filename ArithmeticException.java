class ArithmeticException 
{ 
	public static void main(String args[]) 
	{ 
		try { 
			int a = 30;
			int b = 0; 
			int c = b/a; 
			System.out.println ("Result = " + c); 
		} 
		catch(Exception e) { 
			System.out.println ("Can't divide a number by 0"); 
		} 
	} 
} 
 
