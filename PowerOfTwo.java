import java.util.*;
class PowerOfTwo
{
	public static void main(String[]args)
{
 	Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        if(n<31) {
            System.out.print("powers of 2:");
            for (int i = 0; i <= n; i++) {

                System.out.println((int)Math.pow(2,i));


            }
        }

}
}