package ru.bobrysheva.homework.week7;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);

        System.out.println(Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }

        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
        System.out.println(nums.length);
        System.out.println(index);
        return nums;
    }
}
