import java.util.*;
class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String alphabet=sc.next();
        String vowels="aeiouAEIOU";
        if(vowels.indexOf(alphabet)>=0){
            System.out.println(alphabet+" is a vowel");

        }
        else{
            System.out.println(alphabet+" is a consonant");
        }

    }
}