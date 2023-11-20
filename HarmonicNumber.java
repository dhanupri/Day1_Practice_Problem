import java.util.*;
class HarmonicNumber
{
	public static void main(String[]args)
{
	  Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          double number=0.0;


          if(n!=0){

            for(int i=1;i<=n;i++){
                number+=(double) 1/i;

            }


          }
          System.out.print(number);


}
}