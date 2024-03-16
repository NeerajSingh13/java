import java.util.Scanner;
public class practical01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no. of test cases : ");
        int t = input.nextInt();

        for(int i = 1; i <= t; i++){
            System.out.print("Enter the size of array : ");
            int size = input.nextInt();

            System.out.print("Enter the elements of array : ");
            int[] arr = new int[size];
            for(int j = 0; j<size; j++){
                arr[j] = input.nextInt();
            }

            System.out.print("Enter the key : ");
            int key = input.nextInt();

            int flag = 0;
            int comparisons = 1;
            for(int k = 0; k<size; k++){
                comparisons++;
                if(key==arr[i]){
                    flag = 1;
                    break;
                }
    
            }
            if(flag == 1){
                System.out.println("Present.");
            }
            else{
                System.out.println("Not Present.");
            }
            System.out.println("Comparisons : " + comparisons);
            System.out.println("\n");
        }
    }
}