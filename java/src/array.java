import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Sorted Array:");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}