import java.util.*;
import java.io.*;


class Number{
    void sumdigit(int num){
        int sum=0;
        while(num!=0){
            sum = sum+(num%10);
            num =  num/10;
        }
        System.out.println("Sum of digits=" + sum);

    }
    void reverse(int num){
        int rev=0,r;
        while(num!=0){
            r = num%10;
            rev = (rev*10)+r;
            num = num/10;
         }
         System.out.println("reverse="+rev);

    }
}



public class Sumreverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("\n enter a number");
        int x = s.nextInt();
        Number n = new Number();
        n.sumdigit(x);
        n.reverse(x);
    }
}
