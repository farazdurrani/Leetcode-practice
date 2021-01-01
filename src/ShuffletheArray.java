import java.util.Arrays;

public class ShuffletheArray {

    public static void main(String[] args) {
	int nums[] = { 2, 5, 1, 3, 4, 7 }; // 2,3,5,4,1,7
	int n = 3;
	int[] output = shuffle(nums, n);
	Arrays.stream(output).forEach(o -> System.out.print(o + " "));
    }

    public static int[] shuffle(int[] nums, int n) {
	int mid = nums.length / 2;
	int a[] = new int[mid];
	int b[] = new int[mid];
	for (int i = 0; i < mid; i++) {
	    a[i] = nums[i];
	}
	for (int i = 0; i < mid; i++) {
	    b[i] = nums[i + mid];
	}
	boolean first = true;
	int c = 0;
	for (int i = 0; i < nums.length; i++) {
	    if(first) {
		nums[i] = a[c];
		first = false;
	    } else {
		nums[i] = b[c];
		first = true;
		c++;
	    }
	}
	return nums;
    }

    public static int[] shuffle2(int[] nums, int n) {
	for (int i = 0; i < nums.length; i++) {
	    if (i >= n) {
		exchange(nums, i, i / 2);
		n++;
	    }
	}
	return nums;
    }

    private static void exchange(int[] nums, int i, int j) {
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
    }

}
