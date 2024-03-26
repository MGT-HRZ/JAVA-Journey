package BubbleSort;

/**
 * bubblesort_1
 */
public class bubblesort_1 {
    public static void main(String[] args) {
        int number[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int i:number) {
            System.out.print(i + ", ");
        }

        System.out.println("");

        int n = number.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (number[j - 1] > number[j]) {
                    temp = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = temp;
                }
            }
        }

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + ", ");
        }
    }
}