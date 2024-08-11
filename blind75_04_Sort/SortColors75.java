import java.util.Arrays;

public class SortColors75 {
    public static void sortColors(int[] nums) {
        int[] countArr = {0,0,0}; //0 1 2 colours

        for (int num : nums) {
            countArr[num] += 1;
        }

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < countArr[i]; j++) {
                nums[cnt] = i;
                cnt++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
