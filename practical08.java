import java.util.Scanner;

public class practical08 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Array Size : ");
                int arrSize = input.nextInt();

                int[] arr = new int[arrSize];
                System.out.print("Enter Array Elements: ");
                for (int j = 0; j < arrSize; j++){
                        arr[j] = input.nextInt();
                }

                int comparisons = 0;
                int shifts = 0;
                int minimumIndex;

                for (int i = 0; i < arr.length - 1; i++){
                        minimumIndex = i;
                        for (int j = i + 1; j < arr.length; j++){
                                comparisons++;
                                if (arr[j] < arr[minimumIndex]){
                                        minimumIndex = j;
                                }
                        }
                        if (minimumIndex != i){
                                int temp = arr[minimumIndex];
                                arr[minimumIndex] = arr[i];
                                arr[i] = temp;
                                shifts++;
                        }
                }

                System.out.print("Sorted Array Elements: ");
                for (int k = 0; k < arrSize; k++){
                        System.out.print(arr[k] + " ");
                }
                System.out.println("\n");
                System.out.println("Comparisons : " + comparisons);
                System.out.print("Shifts : " + shifts);
        }
}
