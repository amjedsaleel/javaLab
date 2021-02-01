import java.util.*;
public class Arm {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        int a,b,c,sum;
        b=1;
        System.out.println("Armstrong numbers are:");
        while(b<=range){
            sum = 0;
            c=b;
            while(c>0){
                a = c%10;
                sum = sum+(a*a*a);
                c = c /10;
            }
            if(sum==b){
                System.out.println(b);
            }
            b++;
        }
    }
}
