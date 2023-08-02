import java.util.Arrays;

public class ArrayCount {
    public static int elements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        return (1*2) + elements(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(elements(arr));
    }
}