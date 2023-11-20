import java.util.*;
class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the prime factors are:");

        for(int i=2;i*i<n;i++){
            int h=0;

            if(n%i==0){
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        h++;
                        break;
                    }


                }
                if(h==0){
                    System.out.println(i);
                }
            }





        }

    }
}
