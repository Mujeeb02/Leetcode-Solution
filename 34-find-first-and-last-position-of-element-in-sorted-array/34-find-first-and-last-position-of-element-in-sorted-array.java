class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        if(nums.length==0){
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[1]=i;
            }
        }
        return ans;
    }
}