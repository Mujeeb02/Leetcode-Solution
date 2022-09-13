class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0; 
        }
        int pro=1;
        int count=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
            while(pro>=k){
                pro=pro/nums[start];
                start++;
            }

            count+=i-start+1;       
        }
        return count;
    }
}