public class SortArray {
    public static void bubbleSort(float[] a) {
        boolean sorted = false;
        float temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        float array[] = { 1789, 2035, 1899, 1456, 2013 };
        SortArray solve = new SortArray();
        solve.bubbleSort(array);
        float sum = 0;
        System.out.println("Array after sorted: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println("\nSum = " + sum + ". Averare = " + sum / array.length + ".");
    }
}
