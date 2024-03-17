import java.util.Scanner;
 
 public class jumpSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        
        System.out.print("Enter Key : ");
        int key = input.nextInt();
        
        int low = 0;
        int high = (int)Math.floor(Math.sqrt(n));
        int flag = 0;
        int index = 0;
        int comparisons = 1;
        
        while (arr[high] < key && low < n){
                comparisons++;
                low = high;
                high += (int)Math.floor(Math.sqrt(n));

                if (high > n - 1){
                        high = n;
                }
        }

        for (int i = low; i < high; i++){
                if (arr[i] == key){
                        index = i;
                        flag = 1;
                        break;
                }
        }

        if (flag == 1){
                System.out.println("Element found at index : " + index);
        } else {
                System.out.println("Element Not Found");
        }

        System.out.println("Total Comparisons : " + comparisons);
    }
}