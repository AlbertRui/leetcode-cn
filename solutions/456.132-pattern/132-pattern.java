class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int ak = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] < ak) return true;
            while(!stack.isEmpty()) {
                if(nums[i] > stack.peek()) {
                    ak = stack.pop();
                } else break;
            }
            stack.push(nums[i]);
        }
        return false;
    }
}