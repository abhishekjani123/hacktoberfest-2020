//without extra space or sorting
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length < 2){
            return;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int mid = start;
        
        while(mid<= end){
            if(nums[mid] == 2){
                nums[mid] = nums[end];
                nums[end] =2;
                end--;
            }else if(nums[mid] == 0){
                nums[mid] = nums[start];
                nums[start] = 0;
                mid++;
                start++;
            }
            else{
                mid++;
            }
        }
    }
}
