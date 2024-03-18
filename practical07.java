import java.util.Scanner;

public class practical07 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Array Size : ");
                int arrSize = input.nextInt();

                int[] arr = new int[arrSize];
                System.out.print("Enter Array Elements: ");
                for (int j = 0; j < arrSize; j++){
                        arr[j] = input.nextInt();
                }

                int key;
                int j;
                int comparisons = 0;
                int shifts = 0;

                for (int i = 1; i < arr.length; i++){
                        key = arr[i];
                        j = i - 1;
                        while (j >= 0  && arr[j] > key){
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                                comparisons++;
                                shifts++;
                                j = j - 1;
                        }
                        arr[j + 1] = key;
                        shifts++;
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
