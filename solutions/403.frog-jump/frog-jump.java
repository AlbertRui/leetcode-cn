class Solution {
    public boolean canCross(int[] stones) {
        if (stones.length == 0) return false;
        Map<Integer, Set<Integer>> setMap = new HashMap<>();
        for (int stone : stones) setMap.put(stone, new HashSet<>());
        setMap.get(0).add(0);
        for (int stone : stones) {
            for (int lastStep : setMap.get(stone)) {
                for (int nextStep = lastStep - 1; nextStep <= lastStep + 1; nextStep++) {
                    if (nextStep > 0 && setMap.containsKey(stone + nextStep)) {
                        setMap.get(stone + nextStep).add(nextStep);
                    }
                }
            }
        }
        return !setMap.get(stones[stones.length - 1]).isEmpty();
    }
}