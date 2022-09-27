class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int rs=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(rs-target)){
                    rs=sum;
                }
                if(sum==target){
                    return target;
                }
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
            }
        }
        return rs;
    }
}