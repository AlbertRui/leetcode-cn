class Solution {
   public void moveZeroes(int[] nums) {
       int i = 0;
       int j = 0;
       int len = nums.length;
       while (j < len) {
           if (nums[j] != 0) {
               if (i != j) {
                   nums[i++] = nums[j];
                   nums[j] = 0;
               } else {
                   ++i;
               }
           }
           ++j;
       }
   }
}