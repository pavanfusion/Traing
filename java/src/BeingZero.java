import java.util.Arrays;

class BeingZero{
    void Solve(int[] array, int size){

        // sort array  
        Arrays.sort(array);  // sort is a in-built function in library java.util.Arrays,
        //do not forget to import this before using Arrays.

        // parameters of sort function - array which you need to sort
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " "); // after soting the sorted array will be store in same variable.
        }
        System.out.println();
    }
}