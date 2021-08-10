class AlarmClock
{
	public static String alaramclock(int day,boolean vacation)
	{
		 if(vacation==false && (day==0 || day == 6))
  {
    return "10:00";
    
  }  

  else if(vacation==false && (day!=0 && day != 6))
  {
  return "7:00";
}
else if(vacation==true && (day>=1 && day <= 5))
{
  return "10:00";
}
else
return "off";
	}
	public static void main(String[] args) {
		System.out.println(alaramclock(1,false));
	}
}