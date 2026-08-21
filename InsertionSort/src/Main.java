import java.util.Arrays;

import static java.util.Collections.swap;

public class Main{
    static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);

                }else{
                    break;
                }

            }

        }
    }
}
