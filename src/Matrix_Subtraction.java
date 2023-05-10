public class Matrix_Subtraction {
    public static void main(String[] args) {
        int a[][] = {{4, 5, 6}, {3, 4, 1}, {1, 2, 3}};

        int b[][] = {{2, 0, 3}, {2, 3, 1}, {1, 1, 1}};

        int rows = a.length;
        int cols = a[0].length;

        System.out.println("The subtracted array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(a[i][j] - b[i][j]+" ");
            }
            System.out.println();
        }

    }
}