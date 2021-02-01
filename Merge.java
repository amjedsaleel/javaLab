import java.util.*;
public class Merge {
    public static void main(String[] args) {
        int size1, size2, size, i, j,k;
        int arr1[] =  new int[50];
        int arr2[] =  new int[50];
        int merge[] = new int[120];


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        size1 = s.nextInt();
        System.out.println("Enter Elements:");
        for(i=0;i<size1;i++){
            arr1[i] = s.nextInt();
        }

        // Second array

        System.out.println("Enter the size of second array:");
        size2 = s.nextInt();
        System.out.println("Enter Elements:");
        for(i=0;i<size2;i++){
            arr2[i] = s.nextInt();
        }

        for(i=0; i<size1;i++){
            merge[i] = arr1[i];
        }

        size = size1 + size2;

        for(i=0, k=size1; k<size && i< size2; i++, k++ ){
                merge[k] = arr2[i];

        }

        //Print

        System.out.println("The final result is:");
        for(i=0; i<size; i++){
            System.out.println(merge[i]);
        }

    }
}
