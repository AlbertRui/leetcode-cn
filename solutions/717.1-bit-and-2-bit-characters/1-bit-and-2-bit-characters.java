class Solution {
    public boolean isOneBitCharacter(int[] bits) {
	    int lastIndex = bits.length - 1;
	    int i = 0;
	    while (i < lastIndex) {
	        i += bits[i] + 1;
	    }
	    return (i == lastIndex);
    }
}