import java.util.*;

public class MergeArray {
    public static void main(String[] args){
        Scanner sac = new Scanner(System.in);

        System.out.print("Enter size of first Array: ");
        int size1 = sac.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter first array: ");
        for(int i = 0; i < size1; i++){
            arr1[i] = sac.nextInt();
        }

        System.out.print("Enter size of second Array: ");
        int size2 = sac.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter second Array: ");
        for (int i = 0; i < size2; i++){
            arr2[i] = sac.nextInt();
        }

        int[] merged_array = new int[size1 + size2];

        for (int i = 0 ; i < size1 ; i++){
            merged_array[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++){
            merged_array[size1 + i] = arr2[i];
        }

        System.out.print("Merged Array: ");
        for (int i = 1; i <= size1+size2; i++){
            System.out.print( i + " ");
        }
        sac.close();
    }
}
