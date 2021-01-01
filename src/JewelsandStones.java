
public class JewelsandStones {

    public static void main(String[] args) {
	String jewels = "aA", stones = "aAAbbbb";
	int output = numJewelsInStones(jewels, stones);
	System.out.println(output);
    }

    private static int numJewelsInStones(String jewels, String stones) {
	int output = 0;
	for(char stone : stones.toCharArray()) {
	    if(jewels.contains(String.valueOf(stone))) {
		output++;
	    }
	}
	return output;
    }

}
