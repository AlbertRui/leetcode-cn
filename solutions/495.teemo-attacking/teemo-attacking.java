class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
	int allTime = duration;
	int interval = 0;
	if (timeSeries.length == 0) {
	    return 0;
	} else if (timeSeries.length == 1) {
	    return duration;
	} else {
	    for (int i = 1; i < timeSeries.length; i++) {
		interval = timeSeries[i] - timeSeries[i - 1];
		if (interval < duration) {
		    allTime += interval;
		} else {
		    allTime += duration;
		}
	    }
	    return allTime;
	}
    }
}