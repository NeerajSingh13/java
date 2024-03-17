import java.util.Scanner;

public class practical02 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Number of test cases :");
                int testCases = input.nextInt();

                int i = 1;
                while (i <= testCases){
                        System.out.print("Enter Array Size : ");
                        int arrSize = input.nextInt();

                        int[] arr = new int[arrSize];
                        System.out.print("Enter Array Elements: ");
                        for (int j = 0; j < arrSize; j++){
                                arr[j] = input.nextInt();
                        }

                        System.out.print("Enter Key : ");
                        int key = input.nextInt();

                        int start = 0;
                        int end = arrSize;
                        int result = binarySearch(arr, start, end, key);

                        if (result == 1){
                                System.out.println("Present.");
                        } else {
                                System.out.println("Not Present.");
                        }
                        i++;
                }
        }
        public static int binarySearch(int[] arr, int start, int end, int key){
                int comparisons = 1;
                while (start <= end){
                        comparisons++;
                        int mid  = start + (end - start)/2;
                        if (arr[mid] > key){
                                start = mid + 1;
                        } else if (arr[mid] < key){
                                end = mid - 1;
                        } else {
                                System.out.println("Total Comparisons : " + comparisons);
                                return 1;
                        }
                }
                System.out.println("Total Comparisons : " + comparisons);
                return 0;
        }
}
