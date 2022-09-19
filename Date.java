class Date 
{
	public static void main (String[]args){
	int k = Integer.parseInt(args[0]);
	int m = Integer.parseInt(args[1]);
	int year = Integer.parseInt(args[2]);
	System.out.println("date="+k);
	System.out.println("month="+m);
	System.out.println("Year = "+year);
	int [] mon = {11,12,1,2,3,4,5,6,7,8,9,10};
	int D = year%100 ;
	int C= year/100 ;

	int f= k+(((13*mon[m-1])-1)/5)+D+(D+4)+(C/4)-(2*C) ;

	int res = f%7 ;

	switch(res)
	{
		case 0 : System.out.println("Sunday");
			break;

		case 1 : System.out.println("Monday");
			break ;
		case 2 : System.out.println("Tuesday");
			break ;
		case 3 : System.out.println("Wednesday");
			break ;
		case 4 : System.out.println("Thursday");
			break ;
		case 5 : System.out.println("Friday");
			break ;
		case 6 : System.out.println("Saturday");
			break ;
	};
	
	

	}
}