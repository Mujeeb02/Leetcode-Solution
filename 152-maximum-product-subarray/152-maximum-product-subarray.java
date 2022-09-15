class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int ma=ans;
        int min=ans;
        for(int i=1; i<nums.length;i++){
            if(nums[i]<0){
                int temp=ma;
                ma=min;
                min=temp;
            }
            ma=Math.max(nums[i],ma*nums[i]);
            min=Math.min(nums[i],min*nums[i]);
            ans=Math.max(ans,ma);
        }
        return ans;
    }
}