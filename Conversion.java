import java.util.*;

class Conversion {
    public static void main(String[] args) {
        int p;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal Number");
        p = s.nextInt();

        System.out.println("Binary Equivalent = " + Integer.toBinaryString(p));
        System.out.println("Octal  Equivalent = " + Integer.toOctalString(p));
        System.out.println("Hexadecimal Equivalent = " + Integer.toHexString(p));

    }
}