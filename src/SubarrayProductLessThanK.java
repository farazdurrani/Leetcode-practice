
public class SubarrayProductLessThanK {
    public static void main(String[] args) {
	SubarrayProductLessThanK subProduct = new SubarrayProductLessThanK();
	
//	int nums[] = {10,5,2,6};
	int nums[] = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
	int k = 19;
	int res = subProduct.numSubarrayProductLessThanK(nums, k);
	System.out.println(res);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
//	return subArrayBF(nums, k);
	int low = 0;
	int high = nums.length - 1;
	return subArrayBaC(nums, low, high, k);
    }


    private int subArrayBaC(int[] nums, int low, int high, int k) {
	if(low == high && nums[low] < k) {
	    return nums[low];
	} else {
	    int res = 0;
	    int mid = ( low + high ) / 2;
	    int left = subArrayBaC(nums, low, mid, k);
	    int right = subArrayBaC(nums, mid + 1, high, k);
	    int cross = subArrayCrossingMid(nums, low, mid, high, k);
	    if(left < k) {
		res = cross + left;
	    } 
	    if (right < k) {
		return right;
	    } else {
		return cross;
	    }
//	    return left + right + cross;
//	    return cross;
	}
    }

    private int subArrayCrossingMid(int[] nums, int low, int mid, int high, int k) {
	int product = 1;
	int res = 0;
	for (int i = mid ; i >= low; i--) {
	    product *= nums[i];
	    if(product < k) {
		res++;
	    } else {
		break;
	    }
	}
	product = 1;
	for (int j = mid + 1; j <= high; j++) {
	    product *= nums[j];
	    if(product < k) {
		res++;
	    } else {
		break;
	    }
	}
	return res;
    }

    private int subArrayBF(int[] nums, int k) {
	int res = 0;
	for (int i = 0; i < nums.length; i++) {
	    int product = 1;
	    for (int j = i; j < nums.length; j++) {
		product *= nums[j];
		if(product < k) {
		    res++;
		} else {
		    break;
		}
	    }
	}
	return res;
    }
}
