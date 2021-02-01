public class calculate {
    public static void main(String[] args){
        int x,y,z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        z = x + y;
        System.out.println("sum=" +z);

        z = x - y;
        System.out.println("difference=" +z);

        z = x * y;
        System.out.println("product=" +z);

        z = x / y;
        System.out.println("division=" +z);

        z = x % y;
        System.out.println("modulus=" +z);
    }
}
