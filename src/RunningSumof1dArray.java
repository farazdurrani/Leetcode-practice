public class RunningSumof1dArray {
    
    public static void main(String[] args) {
	RunningSumof1dArray o = new RunningSumof1dArray();
	int nums [] = {1,2,3,4};
	o.runningSum(nums);
	nums = new int[] {1,1,1,1,1};
	o.runningSum(nums);
	nums = new int[] {3,1,2,10,1};
	o.runningSum(nums);
    }
    
    public int[] runningSum(int[] nums) {
	for (int i = 1; i < nums.length; i++) {
	    nums[i] = nums[i] + nums[i-1];
	}
        return nums;
    }
}
