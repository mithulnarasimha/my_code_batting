class Greenticket
{
	public static int greenTicket(int a,int b,int c)
	{
		if( a!=b && a!=c && b!=c)
			return 0;
		else if(a==b && b==c && a==c)
			return 20;
		else if(a==b || b==c || a==c)
			return 10;
	return 0;
	}
	public static void main(String[] args) {
		System.out.println(greenTicket(1, 1, 2));
	}
}