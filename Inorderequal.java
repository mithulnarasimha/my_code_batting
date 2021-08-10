class Inorderequal
{
	public static boolean inOrderEqual(int a,int b,int c,boolean equalok)
	{
		if(equalok==false && a<b && b<c)
		{
			return true;
		}
	else if(equalok==true && a==b || b==c || a==c)
	{
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		System.out.println(inOrderEqual(2, 5, 11, false));
		System.out.println(inOrderEqual(5, 2, 5, true));
	}
}