class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck); 
        int[] res = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) queue.add(i);
        for(int num : deck) {
            res[queue.poll()] = num;
            queue.add(queue.poll());
        }
        return res;
    }
}