import java.util.Scanner;

public class bubbleSort {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Array Size : ");
                int arrSize = input.nextInt();

                int[] arr = new int[arrSize];
                System.out.print("Enter Array Elements: ");
                for (int j = 0; j < arrSize; j++){
                        arr[j] = input.nextInt();
                }

                boolean swapped;
                for (int i = 0; i < arr.length; i++){
                        swapped = false;
                        for (int j = 1; j < arr.length - i ; j++){
                                if (arr[j] < arr[j - 1]){
                                        int temp;
                                        temp = arr[j];
                                        arr[j] = arr[j - 1];
                                        arr[j - 1] = temp; 
                                        swapped = true;
                                }
                        }
                        if (!swapped){
                                break;
                        }
                }

                System.out.print("Sorted Array Elements: ");
                for (int k = 0; k < arrSize; k++){
                        System.out.print(arr[k] + " ");
                }
        }
}
