import java.util.Scanner;

public class Matrix2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];

        System.out.println("Enter elements for Matrix 1 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int[][] sum = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        sum[i][j] = mat1[i][j] + mat2[i][j];
                    }
                }
                System.out.println("Matrix Addition Result:");
                printMatrix(sum);
                break;

            case 2:
                int[][] product = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        product[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            product[i][j] += mat1[i][k] * mat2[k][j];
                        }
                    }
                }
                System.out.println("Matrix Multiplication Result:");
                printMatrix(product);
                break;

            case 3:
                System.out.println("Transpose of Matrix 1:");
                transpose(mat1);
                System.out.println("Transpose of Matrix 2:");
                transpose(mat2);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
