import java.util.Scanner;

public class practical15 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Size of First Array: ");
                int arrSize1 = input.nextInt();

                System.out.print("Enter Array elements : ");
                int [] arr1 = new int[arrSize1];
                for (int i = 0; i < arrSize1; i++){
                        arr1[i] = input.nextInt();
                }

                System.out.print("Enter Size of Second Array: ");
                int arrSize2 = input.nextInt();

                System.out.print("Enter Array elements : ");
                int [] arr2 = new int[arrSize2];
                for (int i = 0; i < arrSize2; i++){
                        arr2[i] = input.nextInt();
                }

                int flag = 0;
                for (int i = 0; i < arrSize1; i++){
                        for (int j = 0; j < arrSize2; j++){
                                if (arr1[i] == arr2[j]){
                                        System.out.print(arr1[i] + " ");
                                        flag = 1;
                                }
                        }
                }
                if (flag == 0){
                        System.out.println("No Common Elements.");
                }

        }
}