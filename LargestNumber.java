import java.util.*;
class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1>number2 && number1>number3){
            System.out.println(number1+" is the largest");
        }
        else if(number2>number1 && number2>number3){
            System.out.println(number2+" is the largest");

        }
        else{
            System.out.println(number3+" is the largest");
        }
    }
}
