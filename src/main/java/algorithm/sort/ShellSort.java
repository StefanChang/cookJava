package algorithm.sort;

import java.util.Arrays;

/**
 * @author changle
 * Created on 2019-07-30
 */
public class ShellSort {
    public static void main(String []args) {
        int []data = {2, 1, 3, 5, 3, 3, 10, 0};
        shellSort(data);
        System.out.println(Arrays.toString(data));
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void shellSort(int []arr){
        int step = arr.length;
        while (true){
            step /= 2;
            for (int k = 0; k < step; k++) {
                for (int i = k; i < arr.length - step; i+=step) {
                    for (int j = i + step; j > k; j-=step){
                        if (arr[j] < arr[j-step]) {
                            int tmp = arr[j];
                            arr[j] = arr[j-step];
                            arr[j-step] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (step == 1) {
                break;
            }
        }
    }
}
