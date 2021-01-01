
public class RichestCustomerWealth {

    public static void main(String[] args) {
	int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
	int output = maximumWealth(accounts);
	System.out.println(output);
    }

    public static int maximumWealth(int[][] accounts) {
	int max = Integer.MIN_VALUE;
	for (int[] ac : accounts) {
	    int sum = 0;
	    for (int i = 0; i < ac.length; i++) {
		sum += ac[i];
	    }
	    if(sum > max) {
		max = sum;
	    }
	}
	return max;
    }
}
