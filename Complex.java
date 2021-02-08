import java.util.*; 
public class Complex {
    int real, img;
    Complex(int r, int i)
    {
        this.real = r;
        this.img = i;

    }
    public static Complex sum(Complex c1, Complex c2)
    {
        Complex temp = new Complex(0,0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    public static void main(String args[])
    {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the real part of complex number1 :");
        int real1 = s.nextInt();

        System.out.println("Enter the imaginary part of complex number1 :");
        int img1 = s.nextInt();

        System.out.println("Enter the real part of complex number2 :");
        int real2 = s.nextInt();

        System.out.println("Enter the imaginary part of complex number2 :");
        int img2 = s.nextInt();

        Complex c1 = new Complex(real1, img1);
        Complex c2 = new Complex(real2, img2);

        Complex temp = sum(c1,c2);
        System.out.println("Sum is: "+ temp.real+ "+" + temp.img+"i");

    }
}
