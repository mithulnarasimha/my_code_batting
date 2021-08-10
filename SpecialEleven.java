class SpecialEleven
{
	public static boolean specialEleven(int a)
	{
		if((a+1)%11==0|| a%11==0)
			return true;
		return false;


	}
	public static void main(String[] args) {
		System.out.println(specialEleven(24));
	}
}