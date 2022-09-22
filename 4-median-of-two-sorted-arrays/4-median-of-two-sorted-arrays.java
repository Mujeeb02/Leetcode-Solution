class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       // if(nums1.length<nums2.length){
       //     return findMedianSortedArrays(nums2,nums1);
       // }
       //  int n1=nums1.length;
       //  int n2=nums2.length;
       //  int low=0;
       //  int high=n1;
       //  while(low<=high){
       //      int cut1=(low+high)>>1;
       //      int cut2=(n1+n2+1)/2-cut1;
       //      int left1=(cut1==0) ? Integer.MIN_VALUE:nums1[cut1-1];
       //      int left2=(cut2==0) ? Integer.MIN_VALUE:nums2[cut2-1];
       //      int right1=(cut1==n1) ? Integer.MAX_VALUE:nums1[cut1];
       //      int right2=(cut2==n2) ? Integer.MAX_VALUE:nums2[cut2];
       //      if(left1<=right2 && left2<=right1){
       //          if((n1+n2)%2==0){
       //              return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
       //          }
       //          else{
       //              return Math.max(left1,left2);
       //          }
       //      }
       //      else if(left1>right2){
       //        high=cut1-1;
       //      }
       //      else{
       //          low=cut1+1;
       //      }
       //  }
       //  return 0.0;
         int n = nums1.length, m = nums2.length;
        
        if(n > m) return findMedianSortedArrays(nums2, nums1);
        
        int begin1 = 0, end1 = n;
        
        while(begin1 <= end1)
        {
            
            int i1 = (begin1 + end1) / 2;
            int i2 = (n + m + 1) / 2 - i1;
            int min1 = (i1 == n) ? Integer.MAX_VALUE : nums1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : nums1[i1 - 1];
            int min2 = (i2 == m) ? Integer.MAX_VALUE : nums2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : nums2[i2 - 1];
            
            if(max1 <= min2 && max2 <= min1)
            {
                if((n + m) % 2 == 0)
                {
                    return (Math.max(max1, max2) + Math.min(min1, min2)) / 2.0;
                }
                else
                {
                    return Math.max(max1, max2);
                }             
            }
            else if(max1 > max2)
            {                
                end1 = i1 - 1;   
            }
            else
            {                
                begin1 = i1 + 1;              
            }
        }
        return 0.0;
    }
}