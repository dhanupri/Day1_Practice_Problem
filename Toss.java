import java.util.*;
class Toss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("number of times to flip coin");
        int number=sc.nextInt();


        int tail=0;
        int head=0;
        for(int i=0;i<number;i++){
            if(Math.random()<0.5){
                tail++;

            }
            else{
                head++;
            }
        }
        System.out.print(head+" "+tail);

        double percentageHeads=(double) head/number*100;
        double percentageTails=(double) tail/number*100;
        System.out.println("Heads percentage:"+percentageHeads);
        System.out.println("Tails percentage"+percentageTails);





    }
}
