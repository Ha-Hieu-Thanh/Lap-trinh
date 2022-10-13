public class AddTwoMatrics {
    public static void main(String[] args) {
        float arr1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        float arr2[][] = { { 13, 23, 34, 45 }, { 56, 61, 72, 83 }, { 49, 15, 131, 112 }, { 15, 34, 85, 34 } };
        float arr3[][] = new float[4][4];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++)
                arr3[i][j] = arr1[i][j] + arr2[i][j];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < arr1[0].length; j++)
                System.out.print(arr3[i][j] + " ");
        }
    }
}
