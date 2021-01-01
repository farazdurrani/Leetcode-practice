import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
	int [] candies = {2,3,5,1,3};
	int extraCandies = 3;
	List<Boolean> list = kidsWithCandies(candies, extraCandies);
	list.forEach(c -> System.out.print(c + " "));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	int max = findMax(candies);
	List<Boolean> list = new ArrayList<>();
	for (int i = 0; i < candies.length; i++) {
	    if(candies[i] + extraCandies >= max) {
		list.add(true);
	    } else {
		list.add(false);
	    }
	}
	return list;
    }

    private static int findMax(int[] candies) {
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < candies.length; i++) {
	    if(candies[i] > max) {
		max = candies[i];
	    }
	}
	return max;
    }
}
