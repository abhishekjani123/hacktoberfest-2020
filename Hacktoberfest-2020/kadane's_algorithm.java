//one of the most popular algorithms

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return Integer.MIN_VALUE;
        }
        int ans = nums[0];
        int tempAns = nums[0];
        for(int i=1; i<nums.length; i++){
            tempAns = Math.max(tempAns+nums[i], nums[i]);
            ans = Math.max(ans, tempAns);
        }
        return ans;
    }
}
