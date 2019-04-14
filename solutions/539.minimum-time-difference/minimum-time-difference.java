class Solution {
    public int findMinDifference(List<String> timePoints) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(String timePoint : timePoints) 
            pq.offer(format(timePoint));
        int first = pq.peek(), pre = pq.poll(), min = Integer.MAX_VALUE;
        while(!pq.isEmpty()) {
            min = Math.min(min, pq.peek() - pre); 
            pre = pq.poll();
        }
        return Math.min(min, 1440 - pre + first);
    }
    private int format(String time) {
        int digit1 = time.charAt(0);
        int digit2 = time.charAt(1);
        int digit3 = time.charAt(3);
        int digit4 = time.charAt(4);
        return (digit1 * 10 + digit2) * 60 + digit3 * 10 + digit4;
    }
}