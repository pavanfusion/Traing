import java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        // Test arrays
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Is arr1 a palindrome? " + isPalindrome(arr1)); // Expected: true
        System.out.println("Is arr2 a palindrome? " + isPalindrome(arr2)); // Expected: false
    }

    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Move pointers towards the middle
        while (left < right) {
            // If elements at pointers don't match, it's not a palindrome
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        // If the loop finishes without mismatch, it is a palindrome
        return true;
    }
}