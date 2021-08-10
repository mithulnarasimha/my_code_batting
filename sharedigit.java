class sharedigit
{
	public static boolean shareDigit(int a,int b)
	{
		if(a/10==b/10 ||a%10 == b/10 ||  b%10 ==a/10 ||b/10==a%10)
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(shareDigit(12,24));
	}
}