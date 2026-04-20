/**
 * Problem: Find the Largest element in an array
 * Problem Statement: Given an array, we have to find the largest element in the array.
 * Platform: takeuforward
 * Difficulty: Easy
 * link:https://takeuforward.org/data-structure/find-the-largest-element-in-an-array
 * Date: April 19, 2026
 *
 * Approach:
 * - Use a HashMap to store each number and its index
 * - For each number, check if (target - number) exists in map
 * - If yes, return both indices
 *
 * Time Complexity: O(N), where N is the size of the array, as we are iterating through the array once.

Space Complexity: O(1), as we are using a constant
 * THIS IS THE OPTIMAL SOLUTION.
 * What I learned:
 * - HashMap lookup is O(1), makes brute force O(n²) into O(n)
 */
import java.util.Scanner;

public class LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
            max = arr[i];
           } 
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the size of the array:");
        int size = sc.nextInt();
            if (size <= 0) {
             System.out.println("Invalid array size");
                return;
}
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = findLargest(arr); // call the function
        // print the result
        System.out.println("Largest element is: "+largest);
        sc.close();
    }
}