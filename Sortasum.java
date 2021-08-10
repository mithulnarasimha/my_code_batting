class Sortasum
{
	public static int sortasu(int a,int b)
	{
		int temp=a+b;
		if(temp>=10 && temp<=19)
			return 20;
		else 
			return temp;
	}
	public static void main(String[] args) {
	int res;
	res=sortasu(10,11);
	System.out.println(res);

	}
}