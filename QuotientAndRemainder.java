import java.util.*;
class QuotientAndRemainder
{
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int divisor=sc.nextInt();
        System.out.println("Quotient of "+n+" divide by "+divisor+": "+n/divisor);
        System.out.println("Reminder of "+n+" divide by "+divisor+": "+n%divisor);

    }
}