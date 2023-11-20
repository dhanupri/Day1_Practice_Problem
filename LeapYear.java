import java.util.*;
class LeapYear
{
	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number%4==0){
		System.out.print(number+"is a leap year");
	}
	else{
		System.out.print(number+"is not a leap year");
	}
}
}