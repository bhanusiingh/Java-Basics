package array;

public class DeclareArray {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int arr[] = {1, 2, 3, 4, 5}; 
        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int arr2[] = new int[5]; // Declare an array of integers with size 5
        // Initialize the array with values
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println("\nElements of the second array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
