// package array;

// public class ReverseArray {
   
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);   //  Scanner created

//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         // Simulate user input by assigning values to the array
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Elements of the array:");
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }

//     }
// }

    
// }
package array;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
