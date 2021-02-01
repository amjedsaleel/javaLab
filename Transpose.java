import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int m, n, i, j;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of row and columns");
        m = s.nextInt();
        n = s.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the element of matrix");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        int transpose[][] = new int[n][m];

        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }

        System.out.println("Transpose of the matrx is");

        for (i = 0; i < n; i++) 
            for (j = 0; j < m; j++){
                System.out.println(transpose[i][j]+"\t");
            // System.out.println("\n");
        }
        System.out.println("The trace of the above matrlx is ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + (matrix[i][j]);
                }
            }
        }
        System.out.println(sum);
    }
}
