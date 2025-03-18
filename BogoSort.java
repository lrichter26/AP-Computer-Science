public class BogoSort {
    private static int shuffles = 0;
    // Sorts array a[0..n-1] using Bogo sort
    public static int bogoSort(int[] a)
    {
        // if array is not sorted then shuffle the
        // array again
        shuffles = 0;
        while (isSorted(a) == false)
            shuffle(a);
        return shuffles;
    }
 
    // To generate permutation of the array
    public static void shuffle(int[] a)
    {
        // Math.random() returns a double positive
        // value, greater than or equal to 0.0 and
        // less than 1.0.
        for (int i = 0; i < a.length; i++) {
            shuffles++;
            swap(a, i, (int)(Math.random() * i));
        }
    }
 
    // Swapping 2 elements
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 
    // To check if array is sorted or not
    public static boolean isSorted(int[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }
 
    // Prints the array
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String[] args)
    {
        // Enter array to be sorted here
        int[] a = {3, 2, 5, 1, 0, 4, 17, 2, 4, 100, 24, 4, 0, 6};
 
        System.out.println(bogoSort(a));
        System.out.print("Sorted array: ");
        printArray(a);
    }
}
