import java.util.Scanner;

 class Student {
    String name;
    int roll;
    Scanner s = new Scanner(System.in);
    
    void getdata() {
        System.out.println("Enter the name");
        name = s.nextLine();
        System.out.println("Enter the roll Number: ");
        roll = s.nextInt();
    }

    void display() {
        System.out.println("Roll number is: " + roll);
        System.out.println("Name: " + name);

    }
}


class Mark extends Student {
    int m1, m2, m3, m4, m5, total, avg;

    void getmark() {
        System.out.println("Enter your Mark1: ");
        m1 = s.nextInt();
        System.out.println("Enter your Mark2: ");
        m2 = s.nextInt();
        System.out.println("Enter your Mark3: ");
        m3 = s.nextInt();
        System.out.println("Enter your Mark4: ");
        m4 = s.nextInt();
        System.out.println("Enter your Mark5: ");
        m5 = s.nextInt();
    }

    void caliculate() {
        total = m1 + m2 + m3 + m4 + m5;
        avg = total / 5;
        System.out.println("Total Mark is: " + total);
        System.out.println("Average of Mark is: " + avg); 
    }
}


public class StudentInfo {
    public static void main(String args[]) {
        Mark m = new Mark();
        m.getdata();
        m.getmark();
        m.display();
        m.caliculate();
    }
}
