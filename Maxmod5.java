class Maxmod5
{
	
	public static int max(int a, int b)
  {
  	if(a==b)
		{
			return 0;
		}
		else if(a%5==b%5)
		{
			if(a<b)
			{
				return a;
			}
			else
			{
				return b;
			}
		}
		
		else if(a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}
}



	
	public static void main(String[] args)
	{
		int a =max(2,3);//3
		System.out.println(a);
		int  b =max(6,2);//6
		System.out.println(b);
		int  c =max(5,15);//5
		
		System.out.println(c);
			}
}
