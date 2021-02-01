import java.util.*;

public class Fibo {
  public static void main(String args[]){
      int n,a=0,b=0,c=1;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the value of n");
      n = s.nextInt();
      System.out.println("Fibinocci Series");
      for(int i=1; i<=n; i++){
          System.out.println(c);
          a=b;
          b=c;
          c=a+b;
      }

  }  
}
