import java.util.Arrays;

public class countsort {
    public static void sort(int[] arr){
        if(arr == null || arr.length <= 1 ){
            return;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] countarray = new int[max + 1];
        for(int num : arr){
            countarray[num]++;
        }
        int index = 0;
        for(int i = 0; i <= max; i++){
            while(countarray[i] > 0){
                arr[index] = i;
                index++;
                countarray[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}