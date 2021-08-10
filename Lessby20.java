class Lessby20
{
public static boolean essby20(int n)
{
	if((n+1)%20==0 ||( n+2) %20==0)
		return true;
	else {
		return false;
	}
}
public static void main(String[] args) {
	System.out.println(essby20(79));
}
}