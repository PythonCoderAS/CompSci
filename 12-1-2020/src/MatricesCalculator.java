import java.util.Scanner;

public class MatricesCalculator {
    public static int[][] add(int[][] a1, int[][] a2) {
        if (a1.length == 0) {
            return new int[0][0];
        }
        int[][] a3 = new int[a1.length][a2[0].length];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a3[i][j] = a1[i][j] + a2[i][j];
            }
        }
        return a3;
    }

    public static int[][] subtract(int[][] a1, int[][] a2) {
        if (a1.length == 0) {
            return new int[0][0];
        }
        int[][] a3 = new int[a1.length][a2[0].length];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a3[i][j] = a1[i][j] - a2[i][j];
            }
        }
        return a3;
    }

    public static int[][] multiply(int[][] a1, int[][] a2) {
        int[][] resultMatrix = new int[a1.length][a2[0].length];
        int sum;
        for (int i=0; i < resultMatrix.length; i++){
            for (int j=0; j < resultMatrix[i].length; j++){
                sum = 0;
                for (int k=0; k < a1[i].length; k++){
                    sum += a1[i][k] * a2[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }
        return resultMatrix;
    }

    public static void printMatrix(int[][] arr){
        System.out.print("[");
        if (arr.length == 1){
            for (int i=0; i < arr[0].length - 1; i++){
                System.out.print(arr[0][i] + " ");
            }
            System.out.print(arr[0][arr[0].length-1] + "]");
        } else {
            for (int i=0; i < arr[0].length - 1; i++){
                System.out.print(arr[0][i] + " ");
            }
            System.out.print(arr[0][arr[0].length-1]);
            for (int i=1; i < arr.length; i++){
                System.out.println();
                System.out.print(" ");
                for (int j=0; j < arr[i].length - 1; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print(arr[i][arr[i].length-1]);
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Matrices Calculator! Which operation would you like to run?");
        System.out.print("1 for addition, 2 for subtraction, and 3 for multiplication: ");
        int mode = scanner.nextInt();
        int[][] a1, a2, result;
        int columns, rows;
        switch (mode){
            case 1:
                System.out.print("Enter the number of rows for the two arrays: ");
                rows = scanner.nextInt();
                System.out.print("Enter the number of columns for the two arrays: ");
                columns = scanner.nextInt();
                a1 = new int[rows][columns];
                a2 = new int[rows][columns];
                for (int i=0; i < rows; i++){
                    for (int j=0; j<columns; j++){
                        System.out.print("Enter the value for a1["+i+"]["+j+"]: ");
                        a1[i][j] = scanner.nextInt();
                    }
                }
                for (int i=0; i < rows; i++){
                    for (int j=0; j<columns; j++){
                        System.out.print("Enter the value for a2["+i+"]["+j+"]: ");
                        a2[i][j] = scanner.nextInt();
                    }
                }
                result = add(a1, a2);
                System.out.println("Result of addition:");
                printMatrix(result);
                break;
            case 2:
                System.out.print("Enter the number of rows for the two arrays: ");
                rows = scanner.nextInt();
                System.out.print("Enter the number of columns for the two arrays: ");
                columns = scanner.nextInt();
                a1 = new int[rows][columns];
                a2 = new int[rows][columns];
                for (int i=0; i < rows; i++){
                    for (int j=0; j<columns; j++){
                        System.out.print("Enter the value for a1["+i+"]["+j+"]: ");
                        a1[i][j] = scanner.nextInt();
                    }
                }
                for (int i=0; i < rows; i++){
                    for (int j=0; j<columns; j++){
                        System.out.print("Enter the value for a2["+i+"]["+j+"]: ");
                        a2[i][j] = scanner.nextInt();
                    }
                }
                result = subtract(a1, a2);
                System.out.println("Result of subtraction:");
                printMatrix(result);
                break;
            case 3:
                System.out.print("Enter the number of rows for the first array: ");
                int row1 = scanner.nextInt();
                System.out.print("Enter the number of columns for the first array: ");
                int col1 = scanner.nextInt();
                System.out.print("Enter the number of rows for the second array: ");
                int row2 = scanner.nextInt();
                System.out.print("Enter the number of columns for the second array: ");
                int col2 = scanner.nextInt();
                a1 = new int[row1][col1];
                a2 = new int[row2][col2];
                for (int i=0; i < a1.length; i++){
                    for (int j=0; j<a1[i].length; j++){
                        System.out.print("Enter the value for a1["+i+"]["+j+"]: ");
                        a1[i][j] = scanner.nextInt();
                    }
                }
                for (int i=0; i < a2.length; i++){
                    for (int j=0; j<a2[i].length; j++){
                        System.out.print("Enter the value for a2["+i+"]["+j+"]: ");
                        a2[i][j] = scanner.nextInt();
                    }
                }
                result = multiply(a1, a2);
                System.out.println("Result of multiplication:");
                printMatrix(result);
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }
    }
}

