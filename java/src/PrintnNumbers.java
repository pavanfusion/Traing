import java.util.*;
public class PrintnNumbers {

public static void main(String[] args) {
    // Outer loop to repeat the process 5 times
    //Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
    int num = 1;
    for (int i = 1; i <= num; i++) {
        // Inner loop to print numbers from 1 to 5
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
            num ++;
        }
        System.out.println(); // To print a new line after print 1-5 once
    }
}
}
