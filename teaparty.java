class teaparty
{
	public static int teapart(int a,int b)
	{
		if(a<5 ||b<5)
			return 0;
		else if(a>=5 && b>=5)
			return 1;
		else if(a>=b*2 || b>=a*2)
			return 2;
		
	return 0;
	}
	public static void main(String[] args) {
		System.out.println(teapart(4,8));
	}
}